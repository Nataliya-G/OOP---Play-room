package com.javalab.playroom.sorting;

import com.javalab.playroom.toy.Toy;

import java.util.Comparator;

/**
 * Created by User on 20.06.2017.
 */
public class ToyRoomPriceComparator implements Comparator<Toy> {

    public int compare(Toy toy1, Toy toy2) {
        Integer toy1Price = toy1.getPrice();
        Integer toy2Price = toy2.getPrice();

        return toy1Price.compareTo(toy2Price);
    }
}
