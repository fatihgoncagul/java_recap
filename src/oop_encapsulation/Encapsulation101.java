package oop_encapsulation;

/*
 * In java ENCAPSULATION means hiding things
 * by making them private or inaccessible
 ** To make the interface simpler, we may want to hide unnecessary details
 ** To protect the integrity of data on an object, we may hide or restriict
 * access to some of the data operations
 ** To decouple the published interface from the internal details of the class,
 * we may hide actual names and types of class members
 ** In this context, interface means class members
 *
 * Allowing direct access to data on an object, can potentially bypass checks, and
 * additional processing, your class has in place to manage the data
 *
 * Omitting a constructor that would accept initialization data, may mean the calling
 * code is responsible for setting up this data, on the new object
 * ENCAPSULATION IS ABOUT DATA CONTROL
 * we protect the members of the class and some methods from external acces
 * when we create a new instance its initialized with valid data
 * but likewise, we are also making sure that theres no direct access to the fields
 *
 * ENCAPSULATION PRINCIPLES:
 *      Create constructors for object init., which enforses that only objects
 * with valid data will get created
 *      use the private acces modifier for your fields
 *      use setter and getter methods sparingly and only as needed
 *      use acces modifiers that are not private, only for the methods that the colling
 * code needs to use
 *
 * */

public class Encapsulation101 {

    public static void main(String[] args) {


/*        PlayerNonEncapsulated player = new PlayerNonEncapsulated();
        player.name = "tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaing health:" + player.healthRemaing());
        player.health = 200;
        player.loseHealth(11);
        System.out.println(player.healthRemaing());*/

        PlayerEncapsulated player = new PlayerEncapsulated("tim",200,"Sword");
        System.out.println("initial health is " + player.healthRemaing() );



    }

}
