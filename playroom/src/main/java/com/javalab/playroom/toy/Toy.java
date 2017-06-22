package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public abstract class Toy{

    private int price;
    private String name;
    private int age;

    public Toy(int price, String name, int age) {
        this.price = price;
        this.name = name;
        this.age = age;
    }

    public int getPrice() {

        return price;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return "Type of toy: " + getClass().getSimpleName() + "; " + "name: " + getName() + "; " + "price: "
                + getPrice() + "; " + "age: " + getAge() + "; ";
    }
}

