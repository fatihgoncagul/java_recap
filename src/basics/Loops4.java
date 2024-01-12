package basics;

import java.util.Scanner;

public class Loops4 {

// döngü içerisinde kaç basamaklı sayının olduğunun bulunması
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("ebter a number: ");


        int num;

        while ((num=Integer.parseInt(kb.nextLine()))!=0){

            System.out.println("number "+num +" has "+ getDigitsCount(num) + " digit");
            System.out.printf("the number of digits %d is : %d\n",num,getDigitsCount(num));

        }
        System.out.println("the number of digits of 0 is 1");



    }

    public static int getDigitsCount(int num){

        if (num==0)
            return 1;

        int count=0;
        while (num!=0){
            ++count;
            num /=10;

        }
        return count;
        //1234 = 1*1000,2*100,3*10+4*1
    }

}
