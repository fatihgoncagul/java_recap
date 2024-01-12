package oop_poly_composition;

/*
*
* Composition, Encapsulation and Polymorphism
* Composition:
* its another componenet of oop.
*Inheritance defines an IS A relationship
* Composition defines HAS A relationship
**** inheritance is a way to reuse functionality and attributes
***** composition is a way to make the combination of classes, act like a single coherent object
*
* subclasses may not need all the attributes from parent class
* if we revise our code for PRODUCT BASE CLASS, we can change the attributes as:
* model,manufacturer
* and create another class called Dimensions which other classes such as motherboard can implement
* because if we have a digital product it does not need to implement x,y,depth
*
*
*
*
* */



public class OopComposition {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","dell","240");
        Monitor theMonitor = new Monitor("27 inch beast","acer",27,"2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200","ASUS",4,6,"V2.44");

        PersonalComputer pc = new PersonalComputer("2208","Dell",theCase,theMonitor,motherBoard);

//        pc.getMonitor().drawPixelAt(10,10,"red");
//        pc.getMotherBoard().loadProgram("Winows OS");
//        pc.getComputerCase().pressPowerButton();

        pc.powerUp();


        //we are accesing functions in other classes through another object which is pc
        // now lets try another scenario where we cant acces motherboard etc directly



    }

}
