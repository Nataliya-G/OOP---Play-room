package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class Cub extends Toy {

    private int numberOfCub;

    public Cub(int price, String name, int age, int numberOfCub) {
        super(price, name, age);
        this.numberOfCub = numberOfCub;
    }

       @Override
    public String toString() {

        return super.toString() + "numberOfCub: " + numberOfCub + ".";
    }
}
