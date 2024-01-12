package basics;

import java.util.Scanner;

public class Loops7 {
    // 123 to 321
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number");


        int num;

        while ((num = Integer.parseInt(kb.nextLine())) != 0) {
            int reverse = getReverse(num);
            System.out.printf("the reverse of %d is %d%n",num,reverse);
        }


    }

    public static int getReverse(int num){

        int reverse = 0;

        while (num!=0){

            reverse = reverse *10 + num%10;
            num /=10;

        }
        return reverse;

    }
}
