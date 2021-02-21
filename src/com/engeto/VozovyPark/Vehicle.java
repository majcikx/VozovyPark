package com.engeto.VozovyPark;

import java.time.LocalDate;

public class Vehicle {
    private String make;
    private String type;
    private String vehicleRegitrationPlate;
    private LocalDate lastTechnicalCheck;
    private int mileage;

    public Vehicle(String make, String type, String vehicleRegitrationPlate, LocalDate lastTechnicalCheck, int mileage) {
        this.make = make;
        this.type = type;
        this.vehicleRegitrationPlate = vehicleRegitrationPlate;
        this.lastTechnicalCheck = lastTechnicalCheck;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleRegitrationPlate() {
        return vehicleRegitrationPlate;
    }

    public void setVehicleRegitrationPlate(String vehicleRegitrationPlate) {
        this.vehicleRegitrationPlate = vehicleRegitrationPlate;
    }

    public LocalDate getLastTechnicalCheck() {
        return lastTechnicalCheck;
    }

    public void setLastTechnicalCheck(LocalDate lastTechnicalCheck) {
        this.lastTechnicalCheck = lastTechnicalCheck;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
