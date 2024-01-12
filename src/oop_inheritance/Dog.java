package oop_inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type,weight,"Perky","curled");
    }
    public Dog(String type,  double weight, String earShape, String tailShape) {
        //using super reduces code reuse
        super(type,  weight < 15 ? "small" : (weight< 35 ? "medium":"large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        super("mutt","big",50);//way to call the constructor of parent class
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    //  OVERRIDING A METHOD is when you create a method on a subclass, which has the same signature as a method on a super class.
    //

    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Ow woooo");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);

        //System.out.println("dogs walk, run and wag their tail");
        if (speed=="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();

    }




    private void bark(){
        System.out.println("WOOF!");
    }
    private void run(){
        System.out.println("dog running");
    }
    private void walk(){
        System.out.println("dog walking");
    }
    private void wagTail(){
        System.out.println("dog wagging tail");
    }
}
