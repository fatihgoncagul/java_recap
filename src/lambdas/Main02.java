package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));

        for (String s : list){
            System.out.println(s);
        }
        // lambdas make our code simpler
        //consumer interface used in foreach method
        // consumer interface has one abstract method, that takes a single argument and does not return anything
        System.out.println("---------");
        list.forEach((String s)-> System.out.println(s)) ;
        System.out.println("---------");
        list.forEach(s-> System.out.println(s)) ;
        System.out.println("---------");
        String prefix = "nato";
        //we cannot change prefix before or after we want to use this variable in lambda expression
        list.forEach(s-> {
        char first = s.charAt(0);
        System.out.println(prefix+" "+s + " means " + first);
        }) ;
        int result = calculator((Integer a, Integer b)-> a+b, 5,2);
        var result2 = calculator(( a,b)-> a+b, "5","2");
        var result3 = calculator((a,b) -> a.toUpperCase() + " " + b.toUpperCase(),"ralph","kramden");
        var result4 = calculator((a,b) -> { b = b+"23";
            return a + b;},"ralph","kramden");



        int result5= calculator2((Integer a, Integer b)-> a+b, 5,2);

        var coords = Arrays.asList(
                new double[]{47.25,56.25},
                new double[]{47.25,56.25},
                new double[]{47.25,56.25},
                new double[]{47.25,56.25}
        );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        //lambda expression can be assigned to a local variable

        BiConsumer<Double,Double> p1 = (lat,lng) -> System.out.printf("[lat:%.3f long:%.3f]%n",lat,lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);

        System.out.println("------");
        coords.forEach(s-> processPoint(s[0],s[1],p1));
        System.out.println("------");
        coords.forEach(s-> processPoint(s[0],s[1],
                (lat,lng) -> System.out.printf("[lat:%.3f long:%.3f]%n",lat,lng)));

        System.out.println("------");
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));
        System.out.println("------ predicate interface --------");
        list.addAll(List.of("echo","easy","earnest"));
        list.removeIf(s -> s.startsWith("ea")&& s.endsWith("y"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("------");
        list.forEach(s -> System.out.println(s));


        String[] emptyStr = new String[10];
        System.out.println(Arrays.toString(emptyStr));
        Arrays.fill(emptyStr,"");
        System.out.println(Arrays.toString(emptyStr));
        Arrays.setAll(emptyStr, (i) -> "" + (i+1) + "...");
        System.out.println(Arrays.toString(emptyStr));

        Arrays.setAll(emptyStr, (i) -> "" + (i) + "..." + switch (i){
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "";
        });
        System.out.println(Arrays.toString(emptyStr));

        String[] names = {"anne","bob","micheal","harvey","hardman"};
        String[] randomList = randomlySelectedValues(15,names,() -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));


    }

    public static <T>  T calculator(Operation<T> function, T value1, T value2 ){

        T result = function.operate(value1, value2);
        System.out.println("result of operation: " + result );
        return result;


    }


    public static <T>  T calculator2(BinaryOperator<T> function, T value1, T value2 ){

        T result = function.apply(value1, value2);
        System.out.println("result of operation: " + result );
        return result;


    }

    public static <T> void  processPoint(T t1, T t2, BiConsumer<T,T> consumer){

        consumer.accept(t1,t2);

    }
    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){

        String[] selectedValues = new String[count];

        for (int i=0;i< values.length;i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

}
