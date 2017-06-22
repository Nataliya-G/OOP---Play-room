package com.javalab.playroom.toy;

/**
 * Created by User on 17.06.2017.
 */
public class Doll extends Toy{

    private String sexOfPerson;

    public Doll(int price, String name, int age, String sexOfPerson) {
        super(price, name, age);
        this.sexOfPerson = sexOfPerson;
    }

    @Override
    public String toString() {

        return super.toString() + "sexOfPerson: " + sexOfPerson + ".";
    }
}


