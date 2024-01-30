package nested_classes_types.burger;

import nested_classes_types.domain.Employee_nested;
import nested_classes_types.domain.StoreEmployee_inner;

import java.util.ArrayList;
import java.util.List;

public class Store {

//THİS MEAL CLASS IS VERY WELL ENCAPSULATED WITH THE USE OF INNER CLASS
// we also used static members in inner class which is allowed after jdk16

    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("ketchup","mayo","bacon","cheddar");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);



    }


}
