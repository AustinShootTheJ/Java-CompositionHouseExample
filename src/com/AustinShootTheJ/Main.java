package com.AustinShootTheJ;

public class Main {

    public static void main(String[] args) {

        Wall theWall = new Wall(new Dimensions(20,15,5),"blue");
        Table theTable = new Table(new Dimensions(5,2,3),4);
        Couch theCouch = new Couch(new Dimensions(10,8,4),8);
        TV theTV = new TV("Sony",new Dimensions(5,8,2));


        LivingRoom theLivingRoom = new LivingRoom(theWall,theTable,theCouch,theTV);



        theLivingRoom.enterRoom();
        theLivingRoom.badDay();
        theLivingRoom.getTheCouch().sitOn();
        theLivingRoom.getTheTable().putFeetUp();
        theLivingRoom.getTheTV().watchTV();


    }
}
