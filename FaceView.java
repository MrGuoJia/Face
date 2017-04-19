package com.example.yls.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
/**
 * Created by yls on 2017/4/18.
 */
public class FaceView extends android.support.v7.widget.AppCompatImageView {
    private Paint p;
    private Rect rect;
    private Paint[]paints;
    private Rect[] rects;
    private int amount;
    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paints=new Paint[10];
        rects=new Rect[10];//写死10个方块和画笔，因为最多识别人脸我设置为10，等MainActivity设置需要多少在用多少个
        for(int i=0;i<paints.length;i++) {
            p = new Paint();
            p.setColor(Color.GREEN);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(5);
            paints[i] = p;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(this.rects != null) {
            for (int i=0;i<getAmount();i++){
                canvas.drawRect(rects[i], paints[i]);
            }
        }
    }
    public void drawFace(Rect[] rects){
        this.rects=rects;
        invalidate();
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    };
}
