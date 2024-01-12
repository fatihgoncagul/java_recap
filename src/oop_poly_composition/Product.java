package oop_poly_composition;

public class Product {
    //now think pc has this three objects as attributes = we call this relationship composition

    // composition is actually modelling parts, and those parts make up greater whole



    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void drawPixelAt(int x, int y,String color){
        System.out.println(String.format(
                "Driving pixel at %d,%d in color %s ",x,y,color));
    }

}
class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void loadProgram(String programName){
        System.out.println("Program "+ programName+" is now loading");
    }
}
class ComputerCase extends Product{


    private String powerSuplly;

    public ComputerCase(String model, String manufacturer, String powerSuplly) {
        super(model, manufacturer);
        this.powerSuplly = powerSuplly;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void pressPowerButton(){
        System.out.println("power button pressed");
    }
}
