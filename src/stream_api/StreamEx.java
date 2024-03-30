package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();
        random.nextInt(100);
        for (int i =1;i<=size;i++){
            nums.add(random.nextInt(100));
        }

        int sum1 = nums.stream()
                .map(i -> i*2)
                .reduce(0,(c,e)->c+e);

        System.out.println("sum1: " + sum1);

        long start2 = System.currentTimeMillis();

        int sum2 = nums.stream()
                .map(i->{
                    try {
                        Thread.sleep(1);
                    }catch (Exception ignored){

                    }
                    return i*2;})
                .mapToInt(i ->i)// it just returns int,
                .sum();

        long end2 = System.currentTimeMillis();

        System.out.println("sequential stream "+"sum2:"  + sum2 + "time passed: "+(end2-start2));

        long start3 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i->{
                    try {
                        Thread.sleep(1);
                    }catch (Exception ignored){

                    }
                    return i*2;})
                .mapToInt(i ->i)// it just returns int,
                .sum();
        long end3 = System.currentTimeMillis();
        System.out.println("parallel stream "+"sum3: "+sum3+"time passed: "+(end3-start3));

    }

}
