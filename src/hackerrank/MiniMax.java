package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);//increasing order
        long[] result = new long[2];

        long totalSum =0;

        for (int num : arr) {
            totalSum += num;
        }

        result[1] = totalSum - arr.get(0); // min
        result[0] = totalSum - arr.get(4); //max

        System.out.printf("%d %d",result[0],result[1]);

    }

}

public class MiniMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Minimax.miniMaxSum(arr);

        bufferedReader.close();
    }
}

