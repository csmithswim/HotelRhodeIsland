package com.csmithswim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    protected String name;
    protected String address;
    protected String guest;
    protected boolean occupancy;
    private List<Room> rooms = new ArrayList<>();

    //Constructor
    public Hotel(String name, String address, Boolean occupied){
        this.name = name;
        this.address = address;
        this.occupancy = true;
    }

    public String displayAvailable(){
        String availableRooms="";
        for (var room : rooms){
                if (room.occupied==true){
                    availableRooms += room;
                }
        }
        System.out.println(availableRooms);
        return availableRooms;
    }

    public List<Room> checkIn(HashMap<String, String> roomEntry){
    //Maybe make a regex to check for string values that are between
    //100-300
        for (var room : rooms){
             if (roomEntry.keySet().toArray()[0].equals(room.roomNumber) && room.occupied!=true){
                room.occupant.equals(roomEntry.get(0));
                room.occupied=true;
             }
        }
        return rooms;
    }

    public List<Room> checkOut(HashMap<String, String> roomEntry){
        //Maybe make a regex to check for string values that are between
        //100-300
        for (var room : rooms){
            if (roomEntry.keySet().toArray()[0].equals(room.roomNumber) && room.occupied!=false){
                room.occupant.equals(roomEntry.get(0));
                room.occupied=false;
            }
        }
        return rooms;
    }



}
