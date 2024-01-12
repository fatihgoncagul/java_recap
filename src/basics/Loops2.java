package basics;

import java.util.Scanner;

public class Loops2 {

    //while döngü içerisindeki girilen değer 0 a eşit olana kadar toplama yapıldı
    //scan.nextınt yaoppınca bazen değer alınmıyor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start entering numbers : ");

        int sum = 0;
        int num;

        while ((num = Integer.parseInt(scanner.nextLine()))!=0){


            sum += num;
            System.out.printf("sum : %d%n" , sum);
        }




        
    }
}
