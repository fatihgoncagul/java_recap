package oop_abstraction;

/*
*
* Abstraction and generalization, in action reduce the amount of code,
* encourage extensible and flexible code
*
* We use these terms when we start trying to model real world things in software
*
* **GENERALIZATION**
*
* When you start modelling objects for your application, you start identifying what
* features and behaviour your objects have in common
*
* We generalize when we create a class hierarchy
*
* A base class is the most general class, the most basic building block
* which everything can be said to have in common
*
* **ABSTRACTION**
*
* Part of generalizing is using abstraction
* You can generalize a set of characteristics and behavior into an abstract type
* If you consider an octopus, a dog and a penguin, you would probably say that
* they are all animals
* An animal is really an abstract concept
* An animal does not really exist, except as a way to describe a set of more specific things
* If you cannot draw it on a piece of paper, its probably abstract
* Abstraction simplifies the view of a set of items' trait and behavior, so we can talk
* about them as a group, as well as generalize their functionality
*
* Java allows us to create a class hierarchy, where the top of the hierarchy, the base class
* is usually an abstract concept, whether it's an abstract class or not
* Java lets us create abstract classes and interfaces
*
*
* Abstract method has a method signature, and a return type, does not have a method body
* so we say an abstract method is unimplemented
* Its purpose is to describe behavior which any object of that type will always have
* Conceptually we can understand behaviors like move or eat on Animal, so we might
* include those as abstract methods, on abstract type
* You can think of an abstract method as a contract
* This contract promises that all subtypes will provide the functionality
* with the agreed upon name and arguments.
*
* ---------
*
* Concrete method:
* A concrete method has a method body, usually with at least one statement
* This means it has operational code, that gets executed, under the right conditions
* A concrete method is said to implement an abstract method, if it overrides one
* Abstract classes and interfaces, can have a mix of abstract and concrete methods
*
* ----------
*
* We know we have public, protected, package and private acces modifiers as options for the members
*
* In addition to acces modifiers methods have other modifiers:
* abstract: method body omitted, can only be declared on abstract class or an interface.
* static : class methods rather than instance method
* final : a method is final cannot be overriden by subclasses
* default : only applicable to an interface,
* native : This is another method with no body, its different from abstact. The method
* body will be implemented in Platform-dependent code
* synchronized : this modifier manages how multiple threads will access the code in this method.
*
*
* abstact class is a class thats incomplete
* you cant create an instance of an abstract class
*
* An abstract class can still have a constructor, which will be called by its subclasses,
* during their construction
*
* An abstact class's purpose, is to define the behaviour it's subclasses are
* required to have, so it always participates in inheritance
*
* Abstarct class can extend abstract class, and concrete class
*
* Abstract methods can only be declared on an abstract class or interface
*
* Subclass of absract class must implement concrete method for any abstract method
* declared on its parent
*
* WHY USE AN ABSTRACT CLASS
*
* In truth, you may never need to use an abstract class in your design,
* but there are some good arguments for using them
*
* An abstract class in your hierarchy forces the deesigners of subclasses, to think
* about and create unique and targeted implementations for the abstracted methods
*
* It may not always make sense to provide a default or inherited implementation
* of a particular method
*
* In our example, we dont really want people creating instances of Animals or Mammals
* We used those classes to abstract behavior at different classification levels
* All Animals have to implement move and makeNoise methods, but only Mammals
* needed to implement shedHair, as we demonstrated.
*
*
*
*
* */


import java.util.ArrayList;

public class Abstractions {

    public static void main(String[] args) {
        //Animal animal = new Animal("animal","big",100);
        Dog dog = new Dog("wolf","big",100);

        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("german sheppard","big",100));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Horse("CLYDSEDALE","large",1000));


        for (Animal animal: animals
             ) {
            doAnimalStuff(animal);
            if (animal instanceof  Mammal currentMammal){
                currentMammal.shedHair();
            }
        }




    }
    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");

    }

}
abstract class Animal{

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void  move(String speed);

    public abstract void makeNoise();

    public final  String getExplicitType(){
        return getClass().getSimpleName() + " ("+ type+ ")";
    }//with final we prevent overriding of subclasses


}
abstract class Mammal extends Animal{
// abstract class that extends another abstract class has flexibility
    //dont have to implement methods
    //but have to implement constructor


    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks": "runs");
    }
    public abstract void shedHair();


}
class  Horse extends Mammal{


    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void shedHair() {

        System.out.println(getExplicitType() + " sheds in the spring");
    }
}


class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("slow")){
            System.out.println(getExplicitType()+" walking");
        }else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void makeNoise() {
        if (type=="Wolf"){
            System.out.println(" howling");
        }else {
            System.out.println(" woof");
        }

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + "shed hair all the time");
    }
}
class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("slow")){
            System.out.println(getExplicitType()+"lazily swimming");
        }else {
            System.out.println(getExplicitType() + "darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type=="Goldfish"){
            System.out.println("swish");
        }else {
            System.out.println("splash");
        }

    }
}