package basics;

import java.util.Scanner;

public class Loops3 {


    public static void main(String[] args) {

        //while içinde pozitif ve negatif sayıların ayrı ayrı toplamı


        Scanner kb = new Scanner(System.in);

        System.out.println("start entering numbers: ");


        int positiveSum = 0;
        int negativeSum = 0;
        int num;
        while ((num = Integer.parseInt(kb.nextLine()))!=0){


            if (num>0){
                positiveSum += num;
            }else {
                negativeSum += num;
            }
            displayResult(positiveSum,negativeSum);
        }



    }

    public static void displayResult(int positiveSum, int negativeSum){


        if (positiveSum>0)
            System.out.printf("sum of positive numbers: %d%n",positiveSum);
        else
            System.out.println("you did not enter any positive numbers");


        if (negativeSum<0){
            System.out.printf("sum of negative numbers: %d%n" , negativeSum);
        }else {
            System.out.println("you did not enter any negative numbers");
        }


    }



}
