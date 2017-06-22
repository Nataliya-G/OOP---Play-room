package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class SmallCar extends Car {

    private String color;

    public SmallCar(int price, String name, int age, String color) {
        super(price, name, age);
        this.color = color;
    }

    @Override
    public String toString() {

        return super.toString() + "color: " + color + ".";
    }
}
