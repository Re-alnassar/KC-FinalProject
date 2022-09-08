package com.example.thegoldenrecipe;

import javax.xml.namespace.QName;

public class Breakfast {
    private int breakfastImage;
    private String discription;
    private String name;
    private int main;
    private int box_Iamge;

    public Breakfast(int breakfastImage, String discription,String name, int main, int box_Iamge) {
        this.breakfastImage = breakfastImage;
        this.discription = discription;
        this.name = name;
        this.main = main;
        this.box_Iamge = box_Iamge;
    }

    public int getBreakfastImage() {
        return breakfastImage;
    }

    public void setBreakfastImage(int breakfastImage) {
        this.breakfastImage = breakfastImage;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMain() {
        return main;
    }

    public void setMain(int main_Image) {
        this.main = main_Image;
    }

    public int getBox_Iamge() {
        return box_Iamge;
    }

    public void setBox_Iamge(int box_Iamge) {
        this.box_Iamge = box_Iamge;
    }
}
