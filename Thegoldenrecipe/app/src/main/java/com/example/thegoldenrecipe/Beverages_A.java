package com.example.thegoldenrecipe;

public class Beverages_A {
     private int beveragesImage;
     private String discription4;
     private String name;
     private int main;
     private int box_Image;

    public Beverages_A(int beveragesImage, String discription4, String name , int main, int box_Image) {
        this.beveragesImage = beveragesImage;
        this.discription4 = discription4;
        this.name = name;
        this.main = main;
        this.box_Image = box_Image;
    }

    public int getBeveragesImage() {
        return beveragesImage;
    }

    public void setBeveragesImage(int beveragesImage) {
        this.beveragesImage = beveragesImage;
    }

    public String getDiscription4() {
        return discription4;
    }

    public void setDiscription4(String discription4) {
        this.discription4 = discription4;
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
