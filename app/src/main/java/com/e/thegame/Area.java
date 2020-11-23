package com.e.thegame;

public class Area {
    protected static Room entranceRoom() {
        int num;
        Room entranceRoom;
        entranceRoom = new Room();
        entranceRoom.roomName = "Chow Hall";
        entranceRoom.roomDescription = "You look around the room. This is the lunch room.";
        entranceRoom.roomNumber = 1;
        entranceRoom.numRoomDirections = (int) (Math.random() * 5 );
        if (entranceRoom.roomNumber == 0) {
            entranceRoom.roomNumber = 1;
        }
        if (entranceRoom.numRoomDirections == 0) {
            entranceRoom.numRoomDirections = 1;
        }

        for (int i = 0; i < entranceRoom.numRoomDirections;i++) {
            num = (int) Math.round(((Math.random() * 9)));
            entranceRoom.roomDirections[i] = Directions.getDirection(num);
        }
        return entranceRoom;
    }
}
