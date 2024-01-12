package oop_interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        // Compiler cares about declared type so if interfaces does not have the method on Animal, interface declared types cannot use that

        // A bird as it turns out can be referred to by this 4 different class
        //lets use some methods


        animal.move();
//        flier.move();
//        tracked.move();
        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();


        // you may think flier.track method should not give compiler error
        //but compiler knows only declared type
        // when we run with the inFlight method, since we assign bird object and that
        // implements trackable interface so flier.track works, remember bird is a runtime object


        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles %n", kmsTraveled, milesTraveled);


        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);


        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
        // we declared arraylist for fliers, if wanna change it later to LinkedList it will cause problems
        // we are gonna need to change the methods too!
        // if we use List interface declaration, later we can change arralist to linkedlist etc.

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);


    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
