package com.example.thegoldenrecipe;

public class Breakfast {
    private int breakfastImage;
    private String discription;

    public Breakfast(int breakfastImage, String discription) {
        this.breakfastImage = breakfastImage;
        this.discription = discription;
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
}
