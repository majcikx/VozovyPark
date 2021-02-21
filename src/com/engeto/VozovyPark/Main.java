package com.engeto.VozovyPark;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void printList(ArrayList<Vehicle> vehicleList){
        for (Vehicle vehicle:vehicleList) {
            if (vehicle.getLastTechnicalCheck().isAfter(LocalDate.of(2021, 02, 21))) {
                //System.out.println(vehicle.getMake() + vehicle.getType() + vehicle.getVehicleRegitrationPlate());
            }
            System.out.println(vehicle.getMake() + vehicle.getType() + vehicle.getVehicleRegitrationPlate());
        }
    }

    public static void main(String[] args) {
	// write your code here
        VehicleReader vehicleReader = new VehicleReader();
        ArrayList<Vehicle> vehicleList = vehicleReader.readList("cars.csv");
        printList(vehicleList);

        for(int i = 0; i <20;i++){
            vehicleList.add(new Vehicle("Hyundai","i40","Engeto0"+(i+1),LocalDate.now(),40));
        }
        printList(vehicleList);
    }


}
