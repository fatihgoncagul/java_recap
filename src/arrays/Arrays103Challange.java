package arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays103Challange {


    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);
        int[] arrayReverse = new int[array.length];
        int a =0;
        for (int i = array.length-1; i >=0; i--) {
            arrayReverse[a++] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReverse));


        System.out.println("other solution");

        int[] newRandomArray = getRandomArr(12);
        System.out.println(Arrays.toString(newRandomArray));
        Arrays.sort(newRandomArray);
        System.out.println(Arrays.toString(sortIntegersDescendingly(newRandomArray)));





    }
    private static int[] sortIntegersDescendingly(int[] array){

        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0;i<sortedArray.length-1;i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;

                 }
            }


        }

        return sortedArray;

    }

    private static int[] getRandomArr(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i <newInt.length ; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }






}
