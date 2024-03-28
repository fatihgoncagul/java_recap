package lambdas;

import javax.annotation.processing.SupportedOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/*
 * java gives us alternative syntax to use for the lambdas that uses named methods
 *
 * these provide a more compact easier to read lambda expression, for methods that
 * are already defined on a class
 *
 * those can be replaced with a method reference
 *
 * methods which can be used are based on the context of the lambda expression
 *
 * this means the method reference is again dependent on the targeted interface's method
 *
 * you can reference an instance method from either an instance external to expression
 * or an instance passed as one of the arguments
 *
 * or you can reference a constructor by using new as the method
 * */
class PlainOld{
    private static int last_id =1;
    private int id;
    public PlainOld(){

        id = PlainOld.last_id++;

        System.out.println("creating a PlainOld object: id = "+ id);


    }
}
public class MethodReferences {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("anna", "bob", "chuvk", "dave"));
        // In this example of a Consumer Interface, not only is the method inferred but parameters are as well
        list.forEach(System.out::println); // s -> System.out.println(s)

        calculator(Integer::sum,1,3);//(a,b)-> a+b
        calculator(Double::sum,1.5,1.3);

        // when you create variables that are lambda expressions or methods references,
        //it is important to remember that code is not invoked at that point
        // the statement or code block gets invoked at the point in the code that the  targeted
        //functional method is called
        // is not it just simpler to call new on the plain old class as we would any new instance
        //in this case yes, later we'll learn methods for creating a lot of instances AT ONCE!!
        // remember, this object is created and then used at a later time, it is NOT immediately executed at the time,
        //it's declared it's deferred and the code snippet gets passed around
        Supplier<PlainOld> reference1 = PlainOld::new; //() -> new PlainOld()
        PlainOld newPojo = reference1.get();// now constructor is invoked


        System.out.println("getting array");
// WE CAN SEE THAT WE CREATED MANY INSTANCES OF PLAINOLD, THIS WILL HELP US ON STREAMS
        PlainOld[] pojo1 = seedArray(PlainOld::new,10);


        calculator((s1,s2)->s1.concat(s2),"hello","world");
        calculator(String::concat,"hello","world");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String,String,String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase; // we cam pass one arghument so if we did concat, the concat will be the passed one but we cant pass another thng

        System.out.println(b1.apply("hello","world"));
        System.out.println(b2.apply("hello","world"));
        System.out.println(u1.apply("hello"));

        String result = "hello".transform(u1);
        System.out.println("result: "+result);

        result = result.transform(String::toLowerCase);
        System.out.println("result: "+result);


        Function<String, Boolean> f0 = String::isEmpty;

        boolean resultBoolean = result.transform(f0);
        System.out.println("result: " + resultBoolean);






    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("result of operation: " + result);
    }
    private static PlainOld[] seedArray(Supplier<PlainOld> reference,int count){
        PlainOld[] array =  new PlainOld[count];
        Arrays.setAll(array,i->reference.get());
        return array;
    }
}
