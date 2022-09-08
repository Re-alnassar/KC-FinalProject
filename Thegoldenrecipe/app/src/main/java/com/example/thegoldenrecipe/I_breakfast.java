package com.example.thegoldenrecipe;

public class I_breakfast {

    private int breakfastImage_I;
    private String dscription_I;
    private String name_I;
    private int main;
    private int box_Image;

    public I_breakfast(int breakfastImage_I, String dscription_I, String name_I, int main, int box_Image) {
        this.breakfastImage_I = breakfastImage_I;
        this.dscription_I = dscription_I;
        this.name_I = name_I;
        this.main = main;
        this.box_Image = box_Image;
    }

    public int getBreakfastImage_I() {
        return breakfastImage_I;
    }

    public void setBreakfastImage_I(int breakfastImage_I) {
        this.breakfastImage_I = breakfastImage_I;
    }

    public String getDscription_I() {
        return dscription_I;
    }

    public void setDscription_I(String dscription_I) {
        this.dscription_I = dscription_I;
    }

    public String getName_I() {
        return name_I;
    }

    public void setName_I(String name_I) {
        this.name_I = name_I;
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
