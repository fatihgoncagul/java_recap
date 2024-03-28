package file_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
*
*
*
* */
public class Main {

    public static void main(String[] args) throws IOException {


        int i = 0;
        int j = 0;
        int num =0;
        BufferedReader br = null;


        try {

            InputStreamReader in = new InputStreamReader(System.in);
             br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());

            j = 18/i;
            System.out.println("bye");
        }catch (Exception e){
            System.out.println("something went wrong");
            System.out.println("bye");
        } finally {
            //it will execute if we have exception or not
            //generally we use it for closing resources
            System.out.println("bye");
            br.close();
        }


        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){

            num = Integer.parseInt(br2.readLine());
            System.out.println(num);
        }


    }
}
