package com.javalab.playroom.factory;

import com.javalab.playroom.room.ToyRoom;
import com.javalab.playroom.toy.Toy;

/**
 * Created by User on 17.06.2017.
 */
public class RoomFactory {

    public ToyRoom createToyRoom(int amount) {
        ToyRoom toyRoom = new ToyRoom();
        ToyFactory toyFactory = new ToyFactory();

        while (amount > 0) {
            Toy a = toyFactory.createToy();
            if (amount >= a.getPrice()) {
                amount = amount - a.getPrice();
                toyRoom.getRoom().add(a);
            }
            else {
                break;
            }
        }
        return toyRoom;
       }
}
