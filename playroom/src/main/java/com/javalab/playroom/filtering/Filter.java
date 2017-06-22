package com.javalab.playroom.filtering;

import com.javalab.playroom.room.ToyRoom;
import com.javalab.playroom.toy.Toy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20.06.2017.
 */
public class Filter {

    public ArrayList<Toy> getToyListByPriceRange(ToyRoom toyRoom, int min, int max) {

        ArrayList<Toy> result = new ArrayList<Toy>();
        for (Toy toy : toyRoom.getRoom()) {
            if (toy.getPrice() >= min && toy.getPrice() <= max) {
                result.add(toy);
            }
        }
        return result;
    }
}



