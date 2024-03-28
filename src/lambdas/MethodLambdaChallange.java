package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

/*
* IF YOU WANT TO EXECUTE A LOT OF FUNCTIONALITY, IN A SORT OF ORDERED TASK
* LIST WAY, LIKE THIS, YOU'D PROBABLY DO IT USING FUNCTIONAL INTERFACE
* METHOD CHAININ, OR WITH STREAMS
*
*
*
* */

public class MethodLambdaChallange {

    private static Random random = new Random();

    private record Person(String first){
        public String last(String s){
            return first + " " + s.substring(0,s.indexOf(" "));
        }

    }
    public static void main(String[] args) {

        String[] names = {"anne","bob","carole","harry","betty"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D','M') + ".",
                s -> s += " " + reverse(s,0,s.indexOf(" ")),
                MethodLambdaChallange::reverse,
                String::new,
                //s -> new String("howdy"+s),
                String::valueOf,
                tim ::last,
                (new Person ("Mary"))::last

        ));
        applyChanges(names,list);

    }
    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){


        List<String > backedArray = Arrays.asList(names);
        for (var function: stringFunctions){

            backedArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));


        }

    }

    private static char getRandomChar (char startChar, char endChar){
        return (char) random.nextInt((int) startChar,(int) endChar+1);
    }
    private static String reverse(String s, int start, int end){
        return new StringBuilder(s.substring(start,end)).reverse().toString();
    }
    private static String reverse(String s){
        return reverse(s,0,s.length());
    }

}
