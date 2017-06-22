package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class Ball extends Toy {

    private String material;

    public Ball(int price, String name, int age, String material) {
        super(price, name, age);
        this.material = material;
    }

    @Override
    public String toString() {

        return super.toString() + "material: " + material + ".";
    }
}
