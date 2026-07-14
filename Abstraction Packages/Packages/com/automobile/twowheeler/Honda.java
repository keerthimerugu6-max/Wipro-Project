package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    public String getOwnerName() {
        return "Bhavani";
    }

    public int getSpeed() {
        return 100;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}