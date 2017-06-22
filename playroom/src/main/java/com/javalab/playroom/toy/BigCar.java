package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class BigCar extends Car {

    private String typeCar;

    public BigCar(int price, String name, int age, String typeCar) {
        super(price, name, age);
        this.typeCar = typeCar;
    }

      @Override
    public String toString() {

        return super.toString() + "type car: " + typeCar + ".";
    }
}
