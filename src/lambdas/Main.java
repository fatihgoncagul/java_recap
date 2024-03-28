package lambdas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * the lambda expression parameters are determined by the associated
 * interface's method, the functional method
 *
 * in the case of comparator, and it's compare method there are two arguments
 *
 * this is why we get o1 and o2 in paranthesis, in the geneerated lambda expression
 *
 * these arguments can be used in the expression, which is on the right of the arrow token
 *
 * (parameter1, parameter2, ...) -> expression or code block;
 *
 * the expression should return a value if the associated interfaces method returns a value
 *
 * for a lambda expression the method is inferred by Java
 *
 * java can infer it cause of the method declaration, sort method
 *
 * but how does it know to call compare?
 * lambda expression only cares about the abstract method on comparator
 *
 * java requires types which support lambda expressions to be something called a
 * functional interface
 *
 * a functional interface is an interface that has one and only one abstract method
 *
 * SAM means SINGLE abstract method, it can be called like this
 *
 * a functional interface is the target type for a lambda expression
 *
 *
 *
 * */


public class Main {

    record Person(String firstName,String lastName){
        @Override
        public String toString() {
            return firstName+" "+lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("lucy","van pelt"),
                new Person("harriet","specter"),
                new Person("michelle","ross"),
                new Person("tess","pearsy")
        ));
        // Using anonymous class



        var comparator = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
               return o1.lastName.compareTo(o2.lastName);
            }
        };
        people.sort(comparator);
        System.out.println(people);
        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(people);

        // local interface since jdk16+

        
        interface EnhancedComparator<T> extends Comparator<T>{
              int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result == 0 ? secondLevel(o1,o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);

            }

        };
        people.sort(comparatorMixed);
        System.out.println(people);



    }

}
