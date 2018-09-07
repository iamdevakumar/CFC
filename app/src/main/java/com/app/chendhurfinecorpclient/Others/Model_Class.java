package com.app.chendhurfinecorpclient.Others;

public class Model_Class {


        public int imageId;
        public String txt;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }



    public Model_Class(String text, int imageId) {

            this.imageId = imageId;
            this.txt = text;
        }
   }
