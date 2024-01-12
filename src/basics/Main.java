package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.print(5*8);
        System.out.println("5 x 4 =" + (5*8 ) );
        //
        System.out.println(" i am " + 20 +" years old");
        // primitive , non primitive
        //primitive belli değeri var null olamıyor, nonprimitivelerin belli değeri yok null olabilir
        System.out.println("byte:" + Byte.MAX_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        // veri tipi seçimi önemli
        //variables
        int age = 20;
        byte b = 10;
        short s = 20;
        long l = 4544545L;
        float pi = 3.14159f;
        double d = 2.58;
        char  c = 'b';

        int a =5,x=2,z=8;
        String Name = "folksdev";

        System.out.println(Name);

        Name = "bootcamp";

        System.out.println(Name);
        String kullaniciAdi = "fatihgncgll";
        int  KDV_ORANİ = 18;
        boolean myBool = false;

        // kullanıcıdan veri alma

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        System.out.println("merhaba" + userName);


        int age2 = scanner.nextInt();

        System.out.println("yaşınız" + age2);



    }
}