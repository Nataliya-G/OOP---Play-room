package com.javalab.playroom.factory;


import com.javalab.playroom.toy.*;

/**
 * Created by User on 17.06.2017.
 */
public class ToyFactory {

    public Toy createToy() {

        Toy result = null;

        int toyNumber = (int) (Math.random() * 5);

        switch (toyNumber) {

            case 0:
                result = new Ball((int) (Math.random() * 50 + 10), "RubberBall" + (int) (Math.random() * 4),
                        (int) (Math.random() * 11 + 2), "rubber");
                break;

            case 1:
                result = new BigCar((int) (Math.random() * 50 + 10), "Truck" + (int) (Math.random() * 4),
                        (int) (Math.random() * 11 + 2), "tanker");
                break;

            case 2:
                result = new Doll((int) (Math.random() * 50 + 10), "Masha" + (int) (Math.random() * 4),
                        (int) (Math.random() * 11 + 2), "girl");
                break;

            case 3:
                result = new Cub((int) (Math.random() * 50 + 10), "Alphabet" + (int) (Math.random() * 4),
                        (int) (Math.random() * 11 + 2), (int) (Math.random() * 19 + 1));
            break;

            case 4:
                result = new MiddleCar((int) (Math.random() * 50 + 10), "Autobus" + (int) (Math.random() * 4),
                        (int) (Math.random() * 11 + 2), (int) (Math.random() * 25 + 5));
                break;

            case 5:
                result = new SmallCar((int) (Math.random() * 50 + 10), "Cabriolet" + (int) (Math.random() * 4),
                    (int) (Math.random() * 11 + 2), "blue"+ (int) (Math.random() * 4));
                break;

                default:
                    break;
        }

        return result;
    }
}


