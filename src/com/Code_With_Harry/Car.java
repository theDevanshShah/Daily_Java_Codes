package com.Code_With_Harry;

public class Car {
    int id;
    String name;
    double length;
    String type;
    boolean isOn;
    int passenger;

    // Creating Car Class
    public Car(int custid, String custname, double custlength, String custtype, boolean custisOn, int custpassenger) {
        id = custid;
        length = custlength;
        type = custtype;
        isOn = custisOn;
        passenger = custpassenger;
    }

    // Creating Methods
    // This is first method for practising just PRINTING STATEMENT
    public void printInfo() {
        System.out.println("Car's Id is: " + id);
        System.out.println("Car's Name is: " + name);
        System.out.println("Car's Length is " + length + " in meters");
        System.out.println("Car's type is: " + type);
        System.out.println("Is the car on: " + isOn);
        System.out.println("No. Of Passengers is: " + passenger);
    }

    // This is second method for practising ARITHMETIC OPERATOR
    public void passengerPlus() {
        passenger += 3;
    }

    // This is third method for practising CONDITIONAL STATEMENT
    public void isONN() {
        if (isOn == false) {
            System.out.println("Car is off");
        }
    }

    // Getters and setters
    public int getID() {

        return this.id;
    }

    public static void main(String[] args) {
        Car devansh = new Car(1, "Volvo", 3.5, "SUV", false, 1);
        System.out.println("Devansh's Car Info");
        devansh.printInfo();
        devansh.getID();

        System.out.println("\nRutvi's Car Info");
        Car rutvi = new Car(2, "Mercedes", 4.5, "Sedan", true, 2);
        rutvi.printInfo();

        System.out.println("\nDhruvi's Car Info");
        Car dhruvi = new Car(3, "Ferrari", 3.5, "Sports", false, 3);
        dhruvi.printInfo();

        System.out.println("\nBansari's Car Info");
        Car bansari = new Car(4, "Baleno", 1.9, "Luxury", false, 4);
        bansari.printInfo();

        System.out.println("\nBansari's Car's Updated Info");
        bansari.passengerPlus();
        bansari.printInfo();
        bansari.isONN();
    }
}