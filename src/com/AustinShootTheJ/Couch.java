package com.AustinShootTheJ;

public class Couch {

    private Dimensions dimensions;
    private int seats;

    public Couch(Dimensions dimensions, int seats) {
        this.dimensions = dimensions;
        this.seats = seats;
    }


    public void sitOn(){
        System.out.println("You sat on the couch!");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getSeats() {
        return seats;
    }
}
