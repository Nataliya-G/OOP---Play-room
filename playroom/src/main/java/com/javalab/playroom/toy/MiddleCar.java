package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class MiddleCar extends Car{

    private int numberOfPassenger;

    public MiddleCar(int price, String name, int age, int numberOfPassenger) {
        super(price, name, age);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String toString() {
        return super.toString() + "numberOfPassenger: " + numberOfPassenger + ".";
    }
}
