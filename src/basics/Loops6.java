package basics;

import java.util.Scanner;

public class Loops6 {
    // DON'T DO EXAMPLES

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int sum= 0;
        int num ;


        /*
        * for(int i=0; i<10;i++){
        * 1. kısım ilk kez ve bir kez çalışacak
        * 2. kısım koşul kısmı
        * 3. kısım döngü bi tur attığında çalışan kısım
        * }

        * */


        for (System.out.println("Start entering numbers: "),System.out.print("num");
             (num= Integer.parseInt(scanner.nextLine()))!=0;sum+= num, System.out.print("num: "));

        System.out.printf("Sum %d%n ", sum);







    }

}
