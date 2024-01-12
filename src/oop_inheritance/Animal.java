package oop_inheritance;

// polymorphism simply means many forms
// we showed that animal can take multiple forms
// it makes code simpler, write code once and use that base class to create other classes

//

public class Animal {

    protected String type; // we change this private to protected so that subclasses can use, also other class in the same package can use
    private String size;
    private  double weight;

    public Animal(){

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);

    }
    public void makeNoise(){

        System.out.println(type + " makes some kind of noise");
    }
}
