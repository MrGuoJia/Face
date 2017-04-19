package com.example.yls.test;

import java.util.List;

/**
 * Created by jia on 2017/4/19.
 */

public class pictureMan {
    /**
     * result_num : 1
     * result : [{"expression":1,"face_probability":0.74841779470444,"glasses":0,"location":{"left":111,"height":90,"width":94,"top":111},"landmark72":[{"y":120,"x":111},{"y":136,"x":111},{"y":152,"x":113},{"y":167,"x":118},{"y":184,"x":127},{"y":197,"x":142},{"y":203,"x":157},{"y":198,"x":173},{"y":186,"x":187},{"y":170,"x":197},{"y":155,"x":202},{"y":140,"x":204},{"y":124,"x":205},{"y":127,"x":128},{"y":125,"x":133},{"y":125,"x":138},{"y":126,"x":142},{"y":130,"x":146},{"y":130,"x":142},{"y":130,"x":137},{"y":129,"x":132},{"y":127,"x":138},{"y":115,"x":122},{"y":112,"x":129},{"y":112,"x":136},{"y":114,"x":143},{"y":119,"x":149},{"y":118,"x":143},{"y":117,"x":136},{"y":116,"x":129},{"y":130,"x":170},{"y":126,"x":174},{"y":125,"x":179},{"y":126,"x":184},{"y":129,"x":189},{"y":130,"x":185},{"y":131,"x":180},{"y":131,"x":175},{"y":128,"x":179},{"y":119,"x":168},{"y":114,"x":174},{"y":112,"x":181},{"y":113,"x":188},{"y":118,"x":195},{"y":117,"x":188},{"y":117,"x":181},{"y":118,"x":175},{"y":131,"x":152},{"y":139,"x":150},{"y":147,"x":148},{"y":155,"x":145},{"y":158,"x":150},{"y":158,"x":165},{"y":156,"x":171},{"y":148,"x":168},{"y":139,"x":166},{"y":131,"x":164},{"y":153,"x":158},{"y":170,"x":139},{"y":168,"x":148},{"y":167,"x":157},{"y":168,"x":167},{"y":171,"x":175},{"y":179,"x":168},{"y":182,"x":157},{"y":179,"x":146},{"y":170,"x":148},{"y":171,"x":157},{"y":170,"x":166},{"y":175,"x":166},{"y":177,"x":157},{"y":175,"x":148}],"beauty":55.724796295166,"race":"yellow","expression_probablity":0.9653240442276,"rotation_angle":1,"landmark":[{"y":127,"x":138},{"y":128,"x":179},{"y":153,"x":158},{"y":173,"x":157}],"yaw":-0.1616583019495,"roll":1.2584481239319,"qualities":{"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.14725802838802,"human":0.85274195671082},"illumination":0},"gender_probability":0.99849796295166,"age":28.245519638062,"gender":"male","glasses_probability":0.99991846084595,"faceshape":[{"type":"square","probability":0.01007828488946},{"type":"triangle","probability":0.0089098727330565},{"type":"oval","probability":0.51916456222534},{"type":"heart","probability":0.092296205461025},{"type":"round","probability":0.3695510327816}],"race_probability":0.99999928474426,"pitch":8.4034767150879}]
     * log_id : 1974154695
     */

    private int result_num;
   // private int log_id;
    private Long log_id;
    private List<ResultBean> result;

    public int getResult_num() {
        return result_num;
    }

    public void setResult_num(int result_num) {
        this.result_num = result_num;
    }

/*    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }*/


    public void setLog_id(Long log_id) {
        this.log_id = log_id;
    }
    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * expression : 1
         * face_probability : 0.74841779470444
         * glasses : 0
         * location : {"left":111,"height":90,"width":94,"top":111}
         * landmark72 : [{"y":120,"x":111},{"y":136,"x":111},{"y":152,"x":113},{"y":167,"x":118},{"y":184,"x":127},{"y":197,"x":142},{"y":203,"x":157},{"y":198,"x":173},{"y":186,"x":187},{"y":170,"x":197},{"y":155,"x":202},{"y":140,"x":204},{"y":124,"x":205},{"y":127,"x":128},{"y":125,"x":133},{"y":125,"x":138},{"y":126,"x":142},{"y":130,"x":146},{"y":130,"x":142},{"y":130,"x":137},{"y":129,"x":132},{"y":127,"x":138},{"y":115,"x":122},{"y":112,"x":129},{"y":112,"x":136},{"y":114,"x":143},{"y":119,"x":149},{"y":118,"x":143},{"y":117,"x":136},{"y":116,"x":129},{"y":130,"x":170},{"y":126,"x":174},{"y":125,"x":179},{"y":126,"x":184},{"y":129,"x":189},{"y":130,"x":185},{"y":131,"x":180},{"y":131,"x":175},{"y":128,"x":179},{"y":119,"x":168},{"y":114,"x":174},{"y":112,"x":181},{"y":113,"x":188},{"y":118,"x":195},{"y":117,"x":188},{"y":117,"x":181},{"y":118,"x":175},{"y":131,"x":152},{"y":139,"x":150},{"y":147,"x":148},{"y":155,"x":145},{"y":158,"x":150},{"y":158,"x":165},{"y":156,"x":171},{"y":148,"x":168},{"y":139,"x":166},{"y":131,"x":164},{"y":153,"x":158},{"y":170,"x":139},{"y":168,"x":148},{"y":167,"x":157},{"y":168,"x":167},{"y":171,"x":175},{"y":179,"x":168},{"y":182,"x":157},{"y":179,"x":146},{"y":170,"x":148},{"y":171,"x":157},{"y":170,"x":166},{"y":175,"x":166},{"y":177,"x":157},{"y":175,"x":148}]
         * beauty : 55.724796295166
         * race : yellow
         * expression_probablity : 0.9653240442276
         * rotation_angle : 1
         * landmark : [{"y":127,"x":138},{"y":128,"x":179},{"y":153,"x":158},{"y":173,"x":157}]
         * yaw : -0.1616583019495
         * roll : 1.2584481239319
         * qualities : {"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.14725802838802,"human":0.85274195671082},"illumination":0}
         * gender_probability : 0.99849796295166
         * age : 28.245519638062
         * gender : male
         * glasses_probability : 0.99991846084595
         * faceshape : [{"type":"square","probability":0.01007828488946},{"type":"triangle","probability":0.0089098727330565},{"type":"oval","probability":0.51916456222534},{"type":"heart","probability":0.092296205461025},{"type":"round","probability":0.3695510327816}]
         * race_probability : 0.99999928474426
         * pitch : 8.4034767150879
         */
        private int expression;
        private double face_probability;
        private int glasses;
        private LocationBean location;
        private double beauty;
        private String race;
        private double expression_probablity;
        private int rotation_angle;
        private double yaw;
        private double roll;
        private QualitiesBean qualities;
        private double gender_probability;
        private double age;
        private String gender;
        private double glasses_probability;
        private double race_probability;
        private double pitch;
        private List<Landmark72Bean> landmark72;
        private List<LandmarkBean> landmark;
        private List<FaceshapeBean> faceshape;

        public int getExpression() {
            return expression;
        }

        public void setExpression(int expression) {
            this.expression = expression;
        }

        public double getFace_probability() {
            return face_probability;
        }

        public void setFace_probability(double face_probability) {
            this.face_probability = face_probability;
        }
        public int getGlasses() {
            return glasses;
        }
        public void setGlasses(int glasses) {
            this.glasses = glasses;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public double getBeauty() {
            return beauty;
        }

        public void setBeauty(double beauty) {
            this.beauty = beauty;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public double getExpression_probablity() {
            return expression_probablity;
        }

        public void setExpression_probablity(double expression_probablity) {
            this.expression_probablity = expression_probablity;
        }
        public int getRotation_angle() {
            return rotation_angle;
        }
        public void setRotation_angle(int rotation_angle) {
            this.rotation_angle = rotation_angle;
        }

        public double getYaw() {
            return yaw;
        }

        public void setYaw(double yaw) {
            this.yaw = yaw;
        }

        public double getRoll() {
            return roll;
        }

        public void setRoll(double roll) {
            this.roll = roll;
        }

        public QualitiesBean getQualities() {
            return qualities;
        }

        public void setQualities(QualitiesBean qualities) {
            this.qualities = qualities;
        }

        public double getGender_probability() {
            return gender_probability;
        }

        public void setGender_probability(double gender_probability) {
            this.gender_probability = gender_probability;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getGlasses_probability() {
            return glasses_probability;
        }

        public void setGlasses_probability(double glasses_probability) {
            this.glasses_probability = glasses_probability;
        }

        public double getRace_probability() {
            return race_probability;
        }

        public void setRace_probability(double race_probability) {
            this.race_probability = race_probability;
        }

        public double getPitch() {
            return pitch;
        }

        public void setPitch(double pitch) {
            this.pitch = pitch;
        }

        public List<Landmark72Bean> getLandmark72() {
            return landmark72;
        }

        public void setLandmark72(List<Landmark72Bean> landmark72) {
            this.landmark72 = landmark72;
        }

        public List<LandmarkBean> getLandmark() {
            return landmark;
        }

        public void setLandmark(List<LandmarkBean> landmark) {
            this.landmark = landmark;
        }

        public List<FaceshapeBean> getFaceshape() {
            return faceshape;
        }

        public void setFaceshape(List<FaceshapeBean> faceshape) {
            this.faceshape = faceshape;
        }

        public static class LocationBean {
            /**
             * left : 111
             * height : 90
             * width : 94
             * top : 111
             */

            private int left;
            private int height;
            private int width;
            private int top;

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }
        }

        public static class QualitiesBean {
            /**
             * completeness : 0
             * blur : 0
             * occlusion : {"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0}
             * type : {"cartoon":0.14725802838802,"human":0.85274195671082}
             * illumination : 0
             */

            private int completeness;
            private int blur;
            private OcclusionBean occlusion;
            private TypeBean type;
            private int illumination;

            public int getCompleteness() {
                return completeness;
            }

            public void setCompleteness(int completeness) {
                this.completeness = completeness;
            }

            public int getBlur() {
                return blur;
            }

            public void setBlur(int blur) {
                this.blur = blur;
            }

            public OcclusionBean getOcclusion() {
                return occlusion;
            }

            public void setOcclusion(OcclusionBean occlusion) {
                this.occlusion = occlusion;
            }

            public TypeBean getType() {
                return type;
            }

            public void setType(TypeBean type) {
                this.type = type;
            }

            public int getIllumination() {
                return illumination;
            }

            public void setIllumination(int illumination) {
                this.illumination = illumination;
            }

            public static class OcclusionBean {
                /**
                 * left_eye : 0
                 * left_cheek : 0
                 * nose : 0
                 * right_eye : 0
                 * chin : 0
                 * mouth : 0
                 * right_cheek : 0
                 */

                private int left_eye;
                private int left_cheek;
                private int nose;
                private int right_eye;
                private int chin;
                private int mouth;
                private int right_cheek;

                public int getLeft_eye() {
                    return left_eye;
                }

                public void setLeft_eye(int left_eye) {
                    this.left_eye = left_eye;
                }

                public int getLeft_cheek() {
                    return left_cheek;
                }

                public void setLeft_cheek(int left_cheek) {
                    this.left_cheek = left_cheek;
                }

                public int getNose() {
                    return nose;
                }

                public void setNose(int nose) {
                    this.nose = nose;
                }

                public int getRight_eye() {
                    return right_eye;
                }

                public void setRight_eye(int right_eye) {
                    this.right_eye = right_eye;
                }

                public int getChin() {
                    return chin;
                }

                public void setChin(int chin) {
                    this.chin = chin;
                }

                public int getMouth() {
                    return mouth;
                }

                public void setMouth(int mouth) {
                    this.mouth = mouth;
                }

                public int getRight_cheek() {
                    return right_cheek;
                }

                public void setRight_cheek(int right_cheek) {
                    this.right_cheek = right_cheek;
                }
            }

            public static class TypeBean {
                /**
                 * cartoon : 0.14725802838802
                 * human : 0.85274195671082
                 */

                private double cartoon;
                private double human;

                public double getCartoon() {
                    return cartoon;
                }

                public void setCartoon(double cartoon) {
                    this.cartoon = cartoon;
                }

                public double getHuman() {
                    return human;
                }

                public void setHuman(double human) {
                    this.human = human;
                }
            }
        }

        public static class Landmark72Bean {
            /**
             * y : 120
             * x : 111
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class LandmarkBean {
            /**
             * y : 127
             * x : 138
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class FaceshapeBean {
            /**
             * type : square
             * probability : 0.01007828488946
             */

            private String type;
            private double probability;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public double getProbability() {
                return probability;
            }

            public void setProbability(double probability) {
                this.probability = probability;
            }
        }
    }
}
