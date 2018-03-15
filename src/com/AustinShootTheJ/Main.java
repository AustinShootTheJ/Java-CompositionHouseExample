package com.AustinShootTheJ;

public class Main {

    public static void main(String[] args) {

        Wall northWall = new Wall(new Dimensions(20,15,5),"blue","north");
        Wall southWall = new Wall(new Dimensions(20,15,5),"blue","south");
        Wall westWall = new Wall(new Dimensions(20,15,5),"blue","west");
        Wall eastWall = new Wall(new Dimensions(20,15,5),"blue","east");
        Table theTable = new Table(new Dimensions(5,2,3),4);
        Couch theCouch = new Couch(new Dimensions(10,8,4),8);
        TV theTV = new TV("Sony",new Dimensions(5,8,2));


        LivingRoom theLivingRoom = new LivingRoom(northWall,southWall,eastWall,westWall,theTable,theCouch,theTV);



        theLivingRoom.enterRoom();
        theLivingRoom.badDay();
        theLivingRoom.getTheCouch().sitOn();
        theLivingRoom.getTheTable().putFeetUp();
        theLivingRoom.getTheTV().watchTV();



    }
}
