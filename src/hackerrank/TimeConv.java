package hackerrank;

import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultTimeConv {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

        String result ="";

        if(s.charAt(s.length()-2)=='P'){
            int parsed = Integer.parseInt(s.substring(0,2));
            if (parsed != 12) {
                parsed += 12;
            }
            String strHour = String.valueOf(parsed);
            result = strHour+s.substring(2,s.length()-2);

        }else{

            int parsed = Integer.parseInt(s.substring(0,2));


            if(parsed==12){
                parsed-=12;

                String strHour = "";

                strHour = "00";

                result = strHour+s.substring(2,s.length()-2);
            }else{
                result = s.substring(0,s.length()-2);
            }


        }
        return result;
    }

}

public class TimeConv {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultTimeConv.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
