package arrays;

public class Vargargs {

    public static void main(String... args) {


        System.out.println(" \"String...\" means same thing Java will take it as an array, BUT it can also take one string");

        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("hello");
        System.out.println("_".repeat(20));

        printText("hello","WORLD","AGAIN");
        printText();//this also works prints nothing
        //there can only be one variable argument in a method
        //the variable argument must be the last argument

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",",sArray));// virgülle ayrılmış string elde ettik



    }
    private static void printText(String... textList){

        for (String t: textList){
            System.out.println(t);
        }

    }




}
