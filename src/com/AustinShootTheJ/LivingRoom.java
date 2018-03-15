package com.AustinShootTheJ;

public class LivingRoom {

    private Wall northWall;
    private Wall southWall;
    private Wall eastWall;
    private Wall westWall;
    private Table theTable;
    private Couch theCouch;
    private TV theTV;

    public LivingRoom(Wall northWall, Wall southWall, Wall eastWall, Wall westWall, Table theTable, Couch theCouch, TV theTV) {
        this.northWall = northWall;
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.theTable = theTable;
        this.theCouch = theCouch;
        this.theTV = theTV;
    }

    public void enterRoom(){
        System.out.println("You entered the room!");
    }

    public void badDay(){
        this.theTable.runInto();
        this.stubbToe();
        this.northWall.lookAt();
        this.southWall.lookAt();
    }



    private void stubbToe(){
        System.out.println("You stubbed your toe!");
    }


    public Table getTheTable() {
        return theTable;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public TV getTheTV() {
        return theTV;
    }
}
