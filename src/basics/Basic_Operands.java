package basics;

import java.util.Scanner;

public class Basic_Operands {


    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println((double)a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        a++;
        System.out.println(a);
        b--;
        System.out.println(b);

        a += 5;
        System.out.println(a);

        a = a +10;
        System.out.println(a);

        // logical operands

        // == , != , > , < , >= , <= , && , || , !

        //if elşse :(

        int x,y,z ;
        x = 5 ;
        y = 18;
        z = 5;

        if ( x == z){
            System.out.println("x eşit z");
        }

        if (x<=y){
            System.out.println("x küçük eşit z");
        }
        if (x!=b){
            System.out.println("x eşit değil b");
        }

        int number =0;

        if (number == 0){
            System.out.println("sayi 0");
        }

        else if (number>0){
            System.out.println("sayi pozitif");
        }

       else if (number<0){
            System.out.println("sayi negatif");
        }

       int yas = 18;

       if (yas>=18){
           System.out.println("resitsiniz");
       } else {
           System.out.println("resit değilsin");
       }

       int not = 95;

       if (not >=90){
           System.out.println("ba");
       } else if (not >=85) {
           System.out.println("bb");
        }
       else if (not >=65) {
           System.out.println("cc");
       }
       else {
           System.out.println("kaldın");
       }

    int n1 = -3, n2 = 7, n3=20;

       if (n1>=n2 && n1>=n3){
           System.out.println("n1 en büyük sayıdır");
       } else if (n2 >= n1 && n2 >= n3) {
           System.out.println("n2 en büyük sayıdır");
       }
       else {
           System.out.println("n3 en büyük sayıdır");

       }


        Scanner scan = new Scanner(System.in);
        System.out.println("n1: ");
        n1 = scan.nextInt();
        System.out.println("n2: ");
        n2 = scan.nextInt();
        System.out.println("n3: ");
        n3= scan.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println("n1 en büyük sayıdır");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("n2 en büyük sayıdır");
        }
        else {
            System.out.println("n3 en büyük sayıdır");

        }



    }
}
