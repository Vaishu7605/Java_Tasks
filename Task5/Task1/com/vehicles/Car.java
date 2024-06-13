package com.vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors){
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("NumberOfDoors: "+ numberOfDoors);
    }
}
