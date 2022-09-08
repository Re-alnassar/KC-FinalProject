package com.example.thegoldenrecipe;

import kotlin.text.UStringsKt;

public class Maindish_A {

    private int maindishImage;
    private String discription2;
    private String name;
    private int main;
    private int box_Image;

    public Maindish_A(int maindishImage, String discription2, String name, int main , int box_image) {
        this.maindishImage = maindishImage;
        this.discription2 = discription2;
        this.name = name;
        this.main = main;
        this.box_Image = box_image;
    }

    public int getMaindishImage() {
        return maindishImage;
    }

    public void setMaindishImage(int maindishImage) {
        this.maindishImage = maindishImage;
    }

    public String getDiscription2() {
        return discription2;
    }

    public void setDiscription2(String discription2) {
        this.discription2 = discription2;
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

    public void setMain(int main) {
        this.main = main;
    }

    public int getBox_Image() {
        return box_Image;
    }

    public void setBox_Image(int box_Image) {
        this.box_Image = box_Image;
    }
}
