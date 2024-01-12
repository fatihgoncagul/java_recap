package basics;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gunSayisi = 5;

        switch (gunSayisi){

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tu");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
        }

        System.out.println("lütfen renk girin");
        String color = scan.next();
        switch (color){

            case "green":
                System.out.println("gogogogo");
                break;
            case "yellow":
                System.out.println("be ready");
                break;
            case "red":
                System.out.println("stop");
                break;
            default:
                System.out.println("bu renk tanmımlı değil");

        }

        int sayi1,sayi2;
        String islem;

        System.out.println("1. sayı:");
        sayi1 = scan.nextInt();
        System.out.println("2. sayı:");
        sayi2 = scan.nextInt();
        System.out.println("islem");
        islem = scan.next();

        switch (islem){

            case "+":
                System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1+sayi2));
                break;
            case "-":
                System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1-sayi2));
                break;
            case "/":
                System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1/sayi2));
                break;
            case "*":
                System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1*sayi2));
                break;
            case "%":
                System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1%sayi2));
                break;
            default:
                System.out.println("islem tanınmadı");

        }

        if (islem .equals("+")) {
            System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1+sayi2));

        } else if (islem.equals("-")) {
            System.out.println(sayi1 + islem + sayi2 + " = " + (sayi1-sayi2));

        }//bunun gibi yapcağımıza switycle yapıyoxz
        else {
            System.out.println("islem tanımlanmamış");
        }


    }

}
