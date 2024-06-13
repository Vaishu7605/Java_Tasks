/*1. Create a package named com.vehicles. 

Inside this package, create a base class called Vehicle with the following: 

Private fields: make and model. 

A constructor to initialize these fields. 

A method displayDetails to print the make and model. 

Create a subclass Car in the same package that extends Vehicle. 

Add a field numberOfDoors. 

Provide a constructor to initialize make, model, and numberOfDoors. 

Override the displayDetails method to include the number of doors. 

Create another subclass Truck with an additional field payloadCapacity. 

Provide a constructor to initialize make, model, and payloadCapacity. 

Override the displayDetails method to include the payload capacity. 

Create a main class in a separate package com.test that creates instances of Car and Truck and calls their displayDetails methods.*/ 


package com.test;

import com.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Truck truck = new Truck("Ford", "F-150", 1.5);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();       
        
    }
}
