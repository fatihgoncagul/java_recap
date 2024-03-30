package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //we want to take even numbers, what can we do? after we want to double and substract
        int sum =0;
/*        for (int n : nums){
            if (n%2==0){
                n = n*2;
                sum = sum + n;

            }
        }*/

        //Stream

        for (int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        for (int n : nums){
            System.out.println(n);
        }


        Consumer<Integer> con = n -> System.out.println(n);

        // consumer is a functional interface which means we can use lambda
        //and this above application show how useful it is. we can use this to filter lists
        // use this filter where we want
        nums.forEach(con);




        nums.forEach(n -> System.out.println(n));
        // above line shows no need for defining the consumer interface


        // STREAM is an interface, stream() methods returns stream object
        // whatever we change in this stream object, it wont chnage the original list
        // once you used stream you cant use it
        Stream<Integer> s1 =   nums.stream();
        s1.forEach(System.out::println);
       // s1.forEach(System.out::println); // it gives runtime error we cant use it anymore
        // what is the benefit of stream?
        // we can use many methods
        Stream<Integer> s2 = s1.filter(n -> n%2==0); // we can filter the values we want
        Stream<Integer> s3 = s2.map(n -> n*2); // or make some operation on them
        s1.forEach(System.out::println);
        // there are also methods that will give you not stream but the last output
        int result = s3.reduce(0,(c,e) -> c+e);
        // in case of big data, we need to filter them, that is where stream might be useful
        int res = nums.stream().filter(n -> n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);

        Predicate<Integer> p = t -> t % 2 == 0; // instead of doing this we just pass the right side of the code to filter method

        Function<Integer,Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };// instead of doing this we just put lambda expression of this into map() function

        // sorting
        Stream<Integer> sortedValues = nums.stream().filter(n -> n%2==0).sorted();

        sortedValues.forEach(System.out::println);


        //  what if we want to do the filtering with multiple threads

        Stream<Integer> sortedValues2 = nums.parallelStream().filter(n -> n%2==0);

        sortedValues.forEach(System.out::println);

    }
}
