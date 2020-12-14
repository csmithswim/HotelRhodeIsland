package com.csmithswim;

public class Room {
    protected String roomNumber;
    protected String roomType;
    protected String occupant;
    protected boolean occupied;

    public Room(String roomNumber, String roomType, String occupant, boolean occupied){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupant = occupant;
        this.occupied = occupied;
    }


}
