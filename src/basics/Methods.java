package basics;

import java.util.Scanner;

public class Methods {


    public static void main(String[] args) {
        sayHello();
        pi();
        writeMessage("message is written");

        int result = topla(5,8);
        System.out.println(topla(5,8));
        System.out.println(result);
        int res2 = topla(1,2,3);
        System.out.println(res2);
        String res3 = topla("se","lam");
        // 2 int yerine bi array verebiliyoz

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter age");
        int age = scan.nextInt();
        System.out.println(isUnderAge(age));

        if (checkVaccinePCR()){
            System.out.println("uçağa binebilirsiniz");
        }else {
            System.out.println("uçağa binemezsiniz");
        }


    }
    // methodlar
    // return type, yoksa void
    //overloading aynı isimli methodu farklı parametrelerle kullanabiliriyoruz


    static  boolean checkVaccinePCR(){

        Scanner scan = new Scanner(System.in);
        String answer;

        System.out.println("son 72 saatte pcr oldun mu y or n");
        answer = scan.next();
        if (answer.equals("y")){
            return true;
        }else {
            System.out.println("aşı oldunuz mu");
            answer = scan.next();

            if (answer=="y"){
                return true;
            }else {
                return true;
            }


        }
    }

    static boolean isUnderAge(int age){

        int border = 18;
        if (age<border){
            return true;
        }
        else {
            return false;
        }
    }

    static int square(int num){

        int res = num*num;
        return res;
    }
    static int topla(int a, int b){

        return a+b;
    }
    static String topla(String a, String b){

        return a+b;
    }
    static int topla(int a, int b, int c){

        return a+b+c;
    }
    static  void sayHello(){

        System.out.println("hello");
    }
    static void pi(){
        System.out.println(3.14);
    }

    static void writeMessage(String message){
        System.out.println(message);



    }




}
