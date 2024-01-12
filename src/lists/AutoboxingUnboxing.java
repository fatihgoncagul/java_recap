package lists;

/*
*
*
*
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class AutoboxingUnboxing {


    public static void main(String[] args) {

        //since we cant create list with primitive types we can go from primitive
        //to wrapper class, which is called boxing, or if its wrapper to primitive
        //its called unboxing.
        Integer boxedInt = Integer.valueOf(15);
        Integer boxedInt2 = 15; //autoboxing
        int unbox = boxedInt2.intValue();
        int unbox2 = boxedInt2;// autounboxing

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));//remember default values are null
        System.out.println(wrapperArray[0].getClass().getSimpleName());

        Character[] characters = {'a','b','c','d'};
        System.out.println(Arrays.toString(characters));

        var list = getList(1,2,3,4,5);//we can use List.of as well
        System.out.println(list);


    }



    private static ArrayList<Integer> getList(Integer... varargs){

        ArrayList<Integer> aList = new ArrayList<>();

        for (int i :
                varargs) {
        aList.add(i);//autoboxing
            
        }
        return aList;
    }
    private static int returnAnInt(Integer i){

        return i;
    }
    private static Integer returnAnInteger(int i){
        return i;
    }
     
}
