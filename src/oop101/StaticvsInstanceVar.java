package oop101;


/*
 *
 * every instance of the class shares the same static variable
 * so if changes are made to that variable, all other
 * instances of that class will see the effect of that change
 *
 * an instance is not required to access the value of the static variable
 *
 * static variables are not used very often but can be very useful
 *
 * for example:
 *      storing counters
 *      generating unique ids
 *      storing a constant value that does not change, like PI
 *      creating and controlling access to a shared resource
 * on the other hand instance variables also known as fields
 * they belong to specific instance of a class
 *
 *
 *
 * */
public class StaticvsInstanceVar {

    static String genus = "golden";
    private String name; //instance variable

    public  void printData() {

        StaticvsInstanceVar x = new StaticvsInstanceVar();
        System.out.println(StaticvsInstanceVar.genus);
        System.out.println(x.genus);//confusing, above usage is better





    }

}
