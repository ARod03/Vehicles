package com.pluralsight;

public class VehicleApp {

    public static void main(String[] args) {

       Car someCar = new Car("white", 5, 14, 20);
       HoverCraft someHoverCraft = new HoverCraft("blue", 10, 37, 40);
       Moped someMoped = new Moped("black", 1, 3, 10);
       SemiTruck someSemiTruck = new SemiTruck("Gray", 2, 48000, 200);
       Vehicle someVehicle = new Vehicle("Silver", 5, 20, 18);

    }

}
