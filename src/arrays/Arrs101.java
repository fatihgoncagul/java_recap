package arrays;

/*
* data structure to store multiple values of the same type
* we use arrays to manage items of the same type
* some common behaviour for arrays would be sorting, initializng values, copying array and finding element
* for an array, this behaviour is not on the array instance itself,
* its provided on helper class java.util.Arrays
*
*
* when we assign an object to a variable, the variable becomes a reference to that object.
*
*
* */


import java.util.Arrays;

public class Arrs101 {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[10];
        int[] arr2 = new int[10];
        // you cannot assign string to an int arr arr2[0] = "aaa";

        for (int i = 0; i < 10; i++) {

            arr[i] = i;

        }
        System.out.println(Arrays.toString(arr));
        arr2[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[4]);

        int[] nums = new int[]{1,2,3,4,5};
        int[] nums2 = {5,5,5,55};
        for (int num: nums2)
             {
                 System.out.println(num);
        }
        //
        int[] newArr ;
        newArr = new int[5];
        for (int num:newArr){
            System.out.println(num);
        }
        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = newArr.length-i;

        }
        for (int num:newArr){
            System.out.println(num);
        }
        for (int num:newArr){

            System.out.printf("num: %d ",num);
        }
        System.out.println(newArr);//gives hexxadecimal represatation of hash code

        //Arrays class provides some functionalities
        System.out.println(Arrays.toString(newArr));

        Object objectVariable = newArr;

        if (objectVariable instanceof int[]){
            System.out.println("objectVariabile is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArr;

        System.out.println("trying referebce etc");

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray"+Arrays.toString(myIntArray));
        System.out.println("anotherArray"+Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change in anotherArray, myIntArray also changes cauese they point the same location");
        System.out.println("myIntArray"+Arrays.toString(myIntArray));
        System.out.println("anotherArray"+Arrays.toString(anotherArray));
        modifyArray(myIntArray);
        System.out.println("after change in myIntArray, anotherArray also changes cauese address gets copied to the method parameter");
        System.out.println("myIntArray"+Arrays.toString(myIntArray));
        System.out.println("anotherArray"+Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){

        array[1] = 2;
    }


}
