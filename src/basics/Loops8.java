package basics;

import java.util.Scanner;

public class Loops8 {

// parametresiyle aldığüı a,b değerleri: a nın b. kuvveti
    //mathpow kullanılmayacakttır
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number");

        for (;;){


            System.out.println("enter the base number");
            int baseNumber = Integer.parseInt(kb.nextLine());
            System.out.println("enter the power of the number");
            int powerOfNumber = Integer.parseInt(kb.nextLine());
            System.out.printf("pow(%d, %d) = %d%n",baseNumber,powerOfNumber,pow(baseNumber,powerOfNumber));

        }

    }
    public static int pow(int baseNumber,int powerOfNumber){

        if (baseNumber<=0){
            return 1;
        }
        int result = 1;

        for (int i = 0;i<powerOfNumber;i++){
            result *= baseNumber;

        }
        return result;

    }



}
