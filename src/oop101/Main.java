package oop101;

public class Main {
//null means the variable or attribute has a type, but
    //no reference to an object
    //this means that no instance or object is assigned to the variable or field
// fields with primitive data types never null

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        car.setMake("Porsche");
        car.setModel("Targa");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("red");
        targa.describeCar();

        Account account = new Account();
        account.setAccountNu("1233");
        account.setBalance(500);
        account.setCustomerName("tim buchg");
        account.setCustomerEmail("tim@gmail.com");

        account.deposit(100);
        account.withdraw(500);
        account.withdraw(150);

        Account account1 = new Account("123",500,"bıb","bob@gmail.com","555 555 5555");
        System.out.println(account1.getAccountNu());
        System.out.println(account1.getBalance());

        Account account2 = new Account();
        System.out.println(account2.getCustomerName());
        System.out.println(account2.getBalance());


        //lets try the constructor with less parameters
        // keep in mind that we used constructor chaining, because of that we add default values
        Account fatihAcc = new Account("fatih","fth@gmail.com","5555");

    }

}
/*
 * Object oriented programming is way to model real world objects
 * as software objects, which contain both data and code
 * objects has state and behaviour
 * state is objects attributes etc
 * behaviour is its actions
 * think of a class as a template or blueprint
 *
 * a class member can be a field or a method or some other type of dependent element
 * if a field is static, there is only one copy in memory, and this value
 * is associated with the class or template itself
 * if a field is not staticc its called an instance field
 * and each object may have a different value stored for this field
 *
 * a static method cant be dependent on any one objects state
 * so it cant reference any instance members
 *
 * in other words, any method that operates
 * on instance fields needs to be nonstatic
 *
 *
 * */