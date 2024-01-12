package oop_practice;

public class OoopMain {


    public static void main(String[] args) {

/*        Item coke = new Item("DRINK","coke",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avacado = new Item("Topping","avacado",1.5);
        avacado.printItem();*/

//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","AVOCADO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.setDrinkSize("LARGE");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chili");
        deluxeMeal.addBurgerToppings("AVOCADO","BACON","HAM","MAYO","LETTUCE");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();






    }
}
