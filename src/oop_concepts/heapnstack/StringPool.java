package oop_concepts.heapnstack;

public class StringPool {



    //these strings and mem adresses, and where are the values are kept?


    public static void main(String[] args) {
        String productName = "HP";

        String productName2 = "HP";

        String productName3 = productName;//product namein adresi kopyalanıyor artık HOnin pooluna işaret ediyor

        String value = new String("HP");

        productName = "xx";
        System.out.println(productName3);

    }
}
