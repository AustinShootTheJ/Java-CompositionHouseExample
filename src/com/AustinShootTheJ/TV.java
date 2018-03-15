package com.AustinShootTheJ;

public class TV {

    private String brand;
    private Dimensions dimensions;

    public TV(String brand, Dimensions dimensions) {
        this.brand = brand;
        this.dimensions = dimensions;
    }

    public void  watchTV(){
        this.powerOn();
        System.out.println("Youre watching TV!");
    }


    private void powerOn(){
        System.out.println("TV turned on!");
    }

    public String getBrand() {
        return brand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
