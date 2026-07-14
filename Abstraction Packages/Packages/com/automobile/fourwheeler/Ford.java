package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP02BB2222";
    }

    public String getOwnerName() {
        return "Bhavani";
    }

    public int speed() {
        return 140;
    }

    public void tempControl() {
        System.out.println("Air Conditioner Started");
    }
}