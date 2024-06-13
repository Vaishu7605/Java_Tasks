package com.vehicles;

public class Truck extends Vehicle {
    private double payloadCapacity;
    
    public Truck(String make, String model, double payloadCapacity){
    super(make,model);
    this.payloadCapacity = payloadCapacity;
}

public void displayDetails(){
    super.displayDetails();
    System.out.println("Payload Capacity: "+payloadCapacity+ "tons" );
    }
}
