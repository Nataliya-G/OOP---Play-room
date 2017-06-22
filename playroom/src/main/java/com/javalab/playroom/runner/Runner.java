package com.javalab.playroom.runner;

import com.javalab.playroom.factory.RoomFactory;
import com.javalab.playroom.filtering.Filter;
import com.javalab.playroom.room.ToyRoom;
import com.javalab.playroom.toy.Toy;
import java.util.List;


/**
 * Created by User on 17.06.2017.
 */
public class Runner {

    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();
        ToyRoom toyRoom = roomFactory.createToyRoom(500);
        final String createToyRoom = "<=========== Fill the room with toys ===========>" + "\n";
        System.out.println(createToyRoom);
        System.out.println(toyRoom);

        toyRoom.sortRoomByPrice();
        final String sorting = "<=========== Sort toys by price ===========>" + "\n";
        System.out.println(sorting);
        System.out.println(toyRoom);

        Filter filter = new Filter();
        final String filtering = "<=========== Get toy list by price range ===========>" + "\n";
        System.out.println(filtering);
        List<Toy> rangeList = filter.getToyListByPriceRange(toyRoom, 10, 30);

        for (int i=0; i < rangeList.size(); i++){
            System.out.println(rangeList.get(i));
        }
    }
}