package org.example;

public class Vehicle {

    private String vehicleName;
    private String vehicleYear;

    public Vehicle(String vehicleName, String vehicleYear) { // 建構子 constructor
        this.vehicleName = vehicleName;
        this.vehicleYear = vehicleYear;
    }

    @Override // override toString method
    public String toString() {
        return "Vehicle Name: " + vehicleName + ", Vehicle Year: " + vehicleYear;
    }
}
