package com.example.yls.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.baidu.aip.face.AipFace;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public static final String APP_ID = "9534968";
    public static final String API_KEY = "GY65jCnFmibm1UK8NRrDzCpF";
    public static final String SECRET_KEY = "R1PHLxpsF5Xt13g6ZXmT42jQ0Br8l88w";
    private Button btn;
    private Button btn_photo;
    private FaceView img;
    private AipFace client;
    private Handler myHandler;
    private pictureMan pictureMan;
    private Rect[] allRect;
    private Bitmap photoBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initDetect();
        initHandler();
    }

    private void initHandler() {
        myHandler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {

                Rect[] rect = (Rect[]) msg.obj;
                img.drawFace(rect);
                return true;
            }
        });
    }

    private void initDetect() {
        // 初始化一个FaceClient
        client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

    }

    private void findViews() {
        btn = (Button) findViewById(R.id.btn_detect);
        btn_photo= (Button) findViewById(R.id.btn_photo);
        btn_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点我将进入相册选取图片", Toast.LENGTH_SHORT).show();
                //调用系统相册，并从中选择一张照片
                img.setAmount(0);
                img.postInvalidate();//使用postInvalidate可以直接在线程中更新界面
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
            }
        });
        img = (FaceView) findViewById(R.id.img);
        btn.setOnClickListener(new View.OnClickListener() {//人脸检测功能
            @Override
            public void onClick(View v) {
                detect();
            }
        });
    }

    private void detect() {//R.raw.two_persons
        Bitmap bmp = null;
        if(photoBitmap==null){
             bmp = BitmapFactory.decodeResource(getResources(), R.raw.two_persons);
        }else {
            bmp=photoBitmap;
        }
        final byte[] imgByte = Bitmap2Bytes(bmp);
        final HashMap<String, String> paraMap = new HashMap<String, String>();
        paraMap.put("max_face_num", "10");//最大是别人数10，不写默认为一
        paraMap.put("face_fields", "age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities");
        new Thread(new Runnable() {
            @Override
            public void run() {
                JSONObject res = client.detect(imgByte, paraMap);
                Log.e("MainAcitity", res.toString());
                //face_probability的int或double会使得APP崩溃.需要的话去修改Json类
                //json解析
                pictureMan = new GsonBuilder().create().fromJson(res.toString(), pictureMan.class);
                final int amount = pictureMan.getResult_num();
                img.setAmount(amount);//为了使FaceView知道需要多少个画笔
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (amount <= 0) {
                            Toast.makeText(MainActivity.this, "没有识别到人", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        Toast.makeText(MainActivity.this, "识别到的人数为:" + amount, Toast.LENGTH_SHORT).show();
                    }
                });
                if (amount <= 0) {
                    return;
                }
                allRect = new Rect[amount];//确认总共有多少个人脸
                for (int i = 0; i < pictureMan.getResult_num(); i++) {
                    Log.e("result----------", "pictureMan.getResult_num()=" + pictureMan.getResult_num());
                    int left = pictureMan.getResult().get(i).getLocation().getLeft();
                    int width = pictureMan.getResult().get(i).getLocation().getWidth();
                    int top = pictureMan.getResult().get(i).getLocation().getTop();
                    int height = pictureMan.getResult().get(i).getLocation().getHeight();
                    Log.e("result----------", " left=" + left + "   width=" + width + "    top=" + top + "    height=" + height);
                    Rect r = new Rect((int) (left / 1.5f), (int) (top / 1.5f), (int) ((left + width) / 1.5f), (int) ((top + height) / 1.5f));
                    allRect[i] = r;
                }
                Message msg = Message.obtain();
                msg.obj = allRect;
                myHandler.sendMessage(msg);

            }

        }).start();
    }

    public byte[] Bitmap2Bytes(Bitmap bm) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.PNG, 100, baos);
        return baos.toByteArray();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            photoBitmap = null;
            //判断手机系统版本号
            if (Build.VERSION.SDK_INT >= 19) {
                //4.4及以上系统使用这个方法处理图片
                photoBitmap = ImgUtil.handleImageOnKitKat(this, data); //对图像的相关操作封装成一个ImgUtil类，便于使用：       //ImgUtil是自己实现的一个工具类
            } else {
                //4.4以下系统使用这个方法处理图片
                photoBitmap = ImgUtil.handleImageBeforeKitKat(this, data);
            }
            img.setImageBitmap(photoBitmap);

        }
    }
}