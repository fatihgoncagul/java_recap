package basics;

import java.util.Scanner;

public class Loops5 {

    // basamak sayılarının toplammı
    //246%10 = 6, 126%10=6 o zaman mod 10da bu iki sayı eşittir
    //248 = 2 + 4 + 8=12 istiyoz
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("ebter a number: ");


        int num;

        while ((num = Integer.parseInt(kb.nextLine())) != 0) {
            int sumOfDigits= getDigitSum(num);
            System.out.println("number " + num + " has digit sum of " + sumOfDigits);
            System.out.printf("the sum of the digits of %d is :  %d%n", num,sumOfDigits);


        }
        System.out.println("the sum of the digit 0 is 0");


    }


    static int getDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num%10;
            num /=10;

        }
        return sum;

    }
}