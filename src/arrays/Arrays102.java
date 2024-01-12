package arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays102 {
    public static void main(String[] args) {

        int[] firstArray = getRandomArr(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);//void method, actual array is sorted
        System.out.println(Arrays.toString(firstArray));//low to high

        int[] secondArr=new int[10];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr,5);
        System.out.println(Arrays.toString(secondArr));

        int[] thirdArr = getRandomArr(10);
        System.out.println(Arrays.toString(thirdArr));

        int[] fourtArr = Arrays.copyOf(thirdArr,thirdArr.length);
        System.out.println(fourtArr);
        //what if sort the copy of the third array will it change the third array
        System.out.println("what if sort the copy of the third array will it change the third array");
        Arrays.sort(fourtArr);
        System.out.println("third: "+Arrays.toString(thirdArr));
        System.out.println("fourth: "+Arrays.toString(fourtArr));
        System.out.println("no it does not");

        int[] smallerArray = Arrays.copyOf(thirdArr,5);
        System.out.println(Arrays.toString(smallerArray));//just get the first five nums of the third array
        int[] largerArray = Arrays.copyOf(thirdArr,15);
        System.out.println(Arrays.toString(largerArray));//it does copy and left space filled withh zeros

        //Finding a match in array
        //arrays class has binary search but it does not guarenttee it will find first occurence of that number
        //binary search returns index of searched key, if not found -1
        String[] sArray = {"able","jane","mark","ralph","david"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"mark")>=0){
            System.out.println("found mark is in the list");
        }
        int[] s1= {1,2,3,4,5};
        int[] s2= {1,2,3,4,5};
        System.out.println(Arrays.equals(s1,s2));





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
