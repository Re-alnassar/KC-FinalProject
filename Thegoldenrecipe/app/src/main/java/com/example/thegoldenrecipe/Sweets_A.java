package com.example.thegoldenrecipe;

public class Sweets_A {

    private int sweetsImage;
    private String discription3;
    private String name;
    private int main;
    private int box_Image;

    public Sweets_A(int sweetsImage, String discription3,String name, int main, int box_Image) {
        this.sweetsImage = sweetsImage;
        this.discription3 = discription3;
        this.name= name;
        this.main= main;
        this.box_Image= box_Image;

    }

    public int getSweetsImage() {
        return sweetsImage;
    }

    public void setSweetsImage(int sweetsImage) {
        this.sweetsImage = sweetsImage;
    }

    public String getDiscription3() {
        return discription3;
    }

    public void setDiscription3(String discription3) {
        this.discription3 = discription3;
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
