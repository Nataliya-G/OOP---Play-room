package com.javalab.playroom.room;

import com.javalab.playroom.sorting.ToyRoomPriceComparator;
import com.javalab.playroom.toy.Toy;

import java.util.*;

/**
 * Created by User on 17.06.2017.
 */
public class ToyRoom {

    private List<Toy> room = new ArrayList<Toy>();

    public List<Toy> getRoom() {

        return room;
    }

    public void sortRoomByPrice(){

        ToyRoomPriceComparator comparator = new ToyRoomPriceComparator();

        Collections.sort(room, comparator);
    }

    @Override
    public String toString() {

        String s = "";

        for (int i = 0; i < room.size(); i++) {
            s = s + room.get(i) + "\n";
        }

        return s;
    }
}