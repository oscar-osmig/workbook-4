package com.pluralsight;

public class Main {

    public static void main(String[] args)
    {
        Room room = new Room(4, 120, false, false);
        System.out.println(room.toString());
        Reservations reservation = new Reservations("king", 4, false);
        System.out.println(reservation.toString());
        Employee osmig = new Employee("1","osmig", "backend", 56.00f , 80.00f);
        System.out.println(osmig.toString());

        room.cleanRoom();
        System.out.println("room available: " + room.isAvailable());

        double in = 12.00;
        double out = 16.00;
        double hours = osmig.punchTimeCard(in, out);
        System.out.println(hours);
    }


}//end of class