package com.AustinShootTheJ;

public class LivingRoom {

    private Wall theWall;
    private Table theTable;
    private Couch theCouch;
    private TV theTV;


    public LivingRoom(Wall theWall, Table theTable, Couch theCouch, TV theTV) {
        this.theWall = theWall;
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
