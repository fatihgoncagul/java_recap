package oop_inheritance;

/*
* its a way to organize classes into parent child hierarchy
* which lets the child inherit fields and methods from its parent
*
* child can have one direct parent but it will inherit
* from its parent class's parent, and so on
*
*
*
* */

public class Main {


    public static void main(String[] args) {

        Animal animal = new Animal("generic animal","huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");//we are passing a dog object while it expects an animal object whic is okay since dog is an animal because it inherits

        Dog yorkie = new Dog("yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador retriever", 65,"Floopy","Swimmer");
        doAnimalStuff(retriever,"slow");


        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow");
        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(goldie,"fast");

    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------");
    }



}
