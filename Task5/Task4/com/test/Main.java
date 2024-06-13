/*4. Create a package com.electronics. 

Define a base class ElectronicDevice with: 
Fields: brand, model. 

A method powerOn() that prints "Powering on the electronic device". 

Create a subclass SmartDevice that extends ElectronicDevice and adds: 

A method connectToWiFi() that prints "Connecting to WiFi". 

Create another subclass SmartPhone that extends SmartDevice and adds: 

A method makeCall() that prints "Making a call". 

In a package com.test, create a main class that creates an instance of SmartPhone and calls all the methods from the hierarchy. */

package com.test;

import com.electronics.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Apple", "iPhone 14");

        smartPhone.powerOn();
        smartPhone.connectToWiFi();
        smartPhone.makeCall();
    }
}
