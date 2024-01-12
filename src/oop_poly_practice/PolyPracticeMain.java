package oop_poly_practice;

public class PolyPracticeMain {

    public static void main(String[] args) {

        Car car = new Car("2022 blue ferrari 296 gts");
        runRace(car);
        Car ferrari = new GasPowerdCar("2002 bluye ferrari 296 gts",15.4,6);
        runRace(ferrari);
        Car tesla = new ElectricCar("2022 TESLA 3",568,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 black ferrari stradale",16,8,8);
        runRace(ferrariHybrid);

    }
    public static void  runRace(Car car){
        car.startEngine();
        car.drive();
    }


}
