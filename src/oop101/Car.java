package oop101;


// when acces modifier is not omitted its called a package acces
//meaning the class is accesible only to classes in the same package
// public: any other class in any package can access this class
// protected: allows classes in the same package, and any subclasses
// in other packages, to have access to the member
// private: means that no ther class can acces this member
// general rule : all fields should be private unlike the class we usually use public

/*
* why do we make all fields private? this practice has a name
* called Encapsulation.
* It is a key fundamental rule of OOP.
* Encapsulation in OOP usually has two meanings:
*  One is packeting of behaviour and attributes on a single object
*  The other is practice of hiding fields, and some methods from public acces
*  which is information hiding or hiding the internal workings of a particular object
* getter and setters
* this keyword refers to is the instance that was created when the object was instantiated
* we can define rules in setter methods
*
* */
public class Car {

    private String make = "Tesla";
    private String model = " Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){

        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden","porsche","tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }


    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){

        System.out.println(doors + "-Door "+
                color+ " "+
                make + " "+
                model+ " " +
                (convertible ? "Convertible": ""));

    }







}
