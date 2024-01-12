package basics;

import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args) {
        int a = 0;
        while(a<10){

            System.out.println(a++);
        }
        System.out.println("reverse");
        int i = 15;
        while(i>0){

            System.out.println(i--);
        }
        int x = 1;
        int y =1;
        while (x<10){
            y=1;
            while (y<9){

                System.out.print(x + " x " + y + " = " + (x*y)+ "|||");
                y++;
            }
            System.out.println();

            x++;

        }
        // sonsuz döngü while true
        while (true){

            System.out.println("infinite");
            break;

        }
        // örnek
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("bir sayı gir");
            int sayi = scan.nextInt();

            if (sayi<0){
                break;
            }else {
                toplam +=sayi;
            }

        }
        System.out.println("toplam: " + toplam);
        int j = 5;
        // do while, ne olursa olsun bi kere çalışmasını iştediğimiz kısmı do ya yazıyoruz
        do{
            System.out.println(j);
            j++;
        }while(j<5);


        // do while 2
        String name ="";
        System.out.println("enter name");

        do {
            name = scan.next();
        }while (name.isEmpty());
        System.out.println("Name "+name);

        // for loops
        for (int k = 0; k <= 10; k+=2) {
            System.out.println("k:" + k);
        }
        for (int k = 10; k >= 00; k-=1) {
            System.out.println("k:" + k);
        }
        String s = "hello world still";
        for (int k = 0; k < s.length(); k++) {
            System.out.print("["+s.charAt(k)+ "]");
        }

//        for(;;){
//            System.out.println("xxx");
//            //infinite loop
//        }
        int counter = 1;

        for (int p= 0;p<3;p++){
            for (int t =0;t<3;t++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }







}
