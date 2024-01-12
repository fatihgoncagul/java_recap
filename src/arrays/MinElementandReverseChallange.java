package arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class MinElementandReverseChallange {


    public static void main(String[] args) {

    int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+ returnedMin);
        System.out.println(Arrays.toString(returnedArray));
        System.out.println("reversed array: "+ Arrays.toString(reverse(returnedArray)));
        reverse2(returnedArray);

    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a list of integer seperated by commas");

        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i=0;i<splits.length;i++){
            values [i] = Integer.parseInt(splits[i].trim());
        }


        return values;

    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for ( int num : array){
            if (num<min){
                min = num;
            }
        }

        return min;

    }
    private static int[] reverse(int[] array){
        int[] reversedArray = new int[array.length];

        int j = array.length-1;

        for (int i = 0;i<array.length;i++){
                reversedArray[i] = array[j];
                j--;
        }
        return reversedArray;
    }

    private static void reverse2(int[] array){

        int maxIndex = array.length-1;
        int halflength = array.length/2;

        for (int i = 0; i < halflength; i++) {
            int temp = array[i];

            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }
        System.out.println("reversed array w/different method:"+Arrays.toString(array));


    }


}
