package oop_poly_practice;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public  void startEngine(){
        System.out.println("Car >> start engine");
    }
    protected void runEngine(){

        System.out.println("Car >> run engine");
    }
    public void drive(){
        System.out.println("Car >> driving, type is "+getClass().getSimpleName());
        runEngine();
    }
}

class GasPowerdCar extends Car{



    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPowerdCar(String description) {
        super(description);
    }

    public GasPowerdCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas >> all %d cylinders are fired up, ready %n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas >> usage exceeds the average %.2f %n",avgKmPerLiter);
    }
}

class ElectricCar extends Car{


    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV >> swithch %d kWh battery on,ready%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV >> usage under the average %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{


    private double avgKmPerLiter;
    private int batterySize = 6;
    private int cylinders = 6;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter,int clyinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = clyinders;
        this.batterySize = batterySize;

    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid >> %d cylinders are fired up.%n",cylinders);
        System.out.printf("BEV >> swithch %d kWh battery on,ready%n",batterySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid >> usage below average %.2f %n", avgKmPerLiter);
    }
}