package oop_interfaces;



//WE dont have to declare the interface type abstract,
// because this modifier is implicityl declared for all interfaces
// Likewise, we dont have to declare any method abstract
// In fact, any method declared without a body, is really implicitly declared
// both public and abstract
// all members of an interface are implicityl public
// if we dont write acces modifier on a class member, it's implicity package private
// If we omit an acces modifier on an interface member, it is implicitly public

enum FlightStages implements Trackable {
    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;

    @Override
    public void track() {
        if (this !=GROUNDED){
            System.out.println("Monitoring "+ this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length];
    }
}

record DragonFly(String name,String type) implements FlightEnabled{


    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth     {

    public void achievedOrbit(){
        System.out.println();
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{

    void achievedOrbit();

}
interface FlightEnabled{

   public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    public  abstract void takeOff();
    abstract void land();
    void fly();

    default     FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on "+
//                getClass().getName());
        FlightStages nextStage = stage.getNextStage();
        System.out.println("transitioning from "+stage + " to " + nextStage );
        return nextStage;

    }


}

interface Trackable{

    void track();

}

public abstract class Animal {

    public abstract void move();

}

class Bird extends Animal implements FlightEnabled,Trackable{


    @Override
    public void move() {
        System.out.println("Bird flapping");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded ");
    }
}
class Jet implements FlightEnabled,Trackable{

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded ");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");


        return FlightEnabled.super.transition(stage);
    }
}
class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded ");
    }
}