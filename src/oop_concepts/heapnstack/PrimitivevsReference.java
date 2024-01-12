package oop_concepts.heapnstack;

public class PrimitivevsReference {


    public static void main(String[] args) {


        long firstTime = System.nanoTime();

        int[] arr = new int[999999];

        for (int i = 0; i < 999999; i++) {
            arr[i] = i;
        }
        long lastTime = System.nanoTime();

        long firstTime2 = System.nanoTime();
        Integer[] arr2 = new Integer[999999];

        for (int i = 0; i < 999999; i++) {
            arr2[i] =  Integer.valueOf(i);
        }
        long lastTime2 = System.nanoTime();


        System.out.println("reference type yaklaşık "+ (lastTime2-firstTime2)/(lastTime-firstTime)+" kat büyük");
    }

}
