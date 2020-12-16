package com.csmithswim;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
   static Scanner sc = new Scanner(System.in);

   static public HashMap<String, String> rentRoom(){
      HashMap<String, String> roomEntry = new HashMap<>();
      System.out.println("Enter room number to rent room.");
      String selectedRoomNumber = sc.nextLine();
      System.out.println("Enter guest's name");
      String selectedRoomGuest = sc.nextLine();
      roomEntry.put(selectedRoomNumber, selectedRoomGuest);
      return roomEntry;
   }

   static public HashMap<String, String> returnRoom(){
      HashMap<String, String> roomEntry = new HashMap<>();
      System.out.println("Enter room number to return room.");
      String selectedRoomNumber = sc.nextLine();
      System.out.println("Enter guest's name");
      String selectedRoomGuest = sc.nextLine();
      roomEntry.put(selectedRoomNumber, selectedRoomGuest);
      return roomEntry;
   }


}
