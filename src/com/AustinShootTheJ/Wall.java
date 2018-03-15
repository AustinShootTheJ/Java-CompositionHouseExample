package com.AustinShootTheJ;

public class Wall {

    private Dimensions dimensions;
    private String color;
    private String direction;


    public Wall(Dimensions dimensions, String color, String direction) {
        this.dimensions = dimensions;
        this.color = color;
        this.direction = direction;
    }



    public void lookAt (){
        System.out.println("You look at the " + this.direction + " wall!");
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
