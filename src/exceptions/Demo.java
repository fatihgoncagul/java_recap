package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyException extends Exception {

    public MyException(String str) {

        super(str);//to pass the message to exception class
    }
}

class A{
    void  show() throws ClassNotFoundException{

            Class.forName("exceptions.Calc");


    }
}

public class Demo {

    static {
        System.out.println("class loaded");
    }


    public static void main(String[] args) throws IOException {
        int j = 0;
        int i = 0;
        int nums[] = new int[5];
        try {

            j = 8 / i;
            if (j == 0) {
                throw new MyException("i dont want to print zero");
            }
            System.out.println(nums[5]);
        } catch (MyException e) {
            j = 18 / i;
            System.out.println("thats the default output" + e);
        } catch (Exception s) {
            System.out.println(s);
        }

        A obj = new A();
        try {
            obj.show();
        }catch (ClassNotFoundException e){
            System.out.println("catched an exception in main");
        }

        System.out.println("enter a number");
        //int num = System.in.read();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();


    }

}
