package lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaChallange {

    public static void main(String[] args) {

        Consumer<String> printTheparts = new Consumer<String>() {
            @Override
            public void accept(String s) {

                String[] parts = s.split(" ");
                for (String part : parts){
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWords = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts){
                System.out.println(part);
            }
        };
        printWords.accept("lets split this up into an array");
        printWords.accept("lets split this up into an array");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        printWordsForEach.accept("lets split this up into an array");


        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
        printWordsConcise.accept("lets split this up into an array");


        //it can also be UnarOperator, challenge 2
        Function<String , String> everySecondChar = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0;i<s.length();i++){
                if (i%2==1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        //challange 3


        UnaryOperator<String> everySecondChar2 = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0;i<s.length();i++){
                if (i%2==1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondChar2.apply("1234567890"));

        //challange 4 writing a method everySecondCharacter
        //challange 5 use that meethod

        String result = everySecondCharacter(everySecondChar2,"1234567890");
        System.out.println(result);

        //challange 6

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {return "I love Java!";};

        //challange 7
        //lambdas represent deferred executions of snippets of code
        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());
        System.out.println(iLoveJava2);







    }

    public static String everySecondCharacter(Function<String , String> function,String source){
        return function.apply(source);
    }

    public static String everySecondChar(String source){

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0;i<source.length();i++){
            if (i%2==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();

    }




}
