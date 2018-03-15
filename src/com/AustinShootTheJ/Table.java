package com.AustinShootTheJ;

public class Table {

    private Dimensions dimensions;
    private int legs;

    public Table(Dimensions dimensions, int legs) {
        this.dimensions = dimensions;
        this.legs = legs;
    }


    public void putFeetUp(){
        System.out.println("You put your feet up");
    }


    public void runInto(){
        System.out.println("You bumped the table!");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getLegs() {
        return legs;
    }
}
