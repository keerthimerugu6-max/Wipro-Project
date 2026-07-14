package com.automobile.fourwheeler;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println(l.speed());
        l.gps();

        System.out.println();

        Ford f = new Ford();

        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println(f.speed());
        f.tempControl();
    }
}