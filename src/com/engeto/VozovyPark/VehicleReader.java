package com.engeto.VozovyPark;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleReader {
    public ArrayList<Vehicle> readList(String filename) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNext()){
                String make = scanner.next();
                String type = scanner.next();
                String vehicleRegistrationPlate = scanner.next();
                String lastTechnicalCheckString = scanner.next();
                LocalDate lastTechnicalCheck = LocalDate.parse(lastTechnicalCheckString);
                int mileage = scanner.nextInt();
                vehicleList.add(new Vehicle(make,type,vehicleRegistrationPlate,lastTechnicalCheck,mileage));
            }
        }
        catch (Exception ex){
            System.err.println("Error while reading file: " + filename+"!");
            System.err.println("Error message: "+ex.getLocalizedMessage());
        }
        return  vehicleList;
    }

}
