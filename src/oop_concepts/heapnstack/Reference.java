package oop_concepts.heapnstack;

import java.util.Arrays;

public class Reference {

    int[] notes;
    boolean[] active;
    String[] names;
    String message;

    public static void main(String[] args) {

        Reference reference = new Reference();
        // default value null
        System.out.println(reference.message);
        System.out.println(Arrays.toString(reference.active));
        System.out.println(Arrays.toString(reference.names));
        // heap ve stack olayı

         Integer i = Integer.valueOf(2);
         String name = "furkan"; //değerler heapte, burayı işaret eden mem adresste stackte tutuluyp

        int[] school = {5,4,3,2,1};
        System.out.println(Arrays.toString(school));
        int[] highschool = school;
        System.out.println(Arrays.toString(highschool));
        school[0] =0;

        System.out.println(Arrays.toString(highschool));

        int a = 5;
        int b = 5;
        System.out.println(a==b);//içindeki değerler karşılaştırılıyor
        //referans tiplerde adres eşit mi diye bakıyor

        String pName = new String("kazak");
        String pName2 = new String("kazak");
        System.out.println(pName2==pName);
        //equals methodu değerlerine bakıyor
        System.out.println(pName2.equals(pName));

        String s = "abc";
        String s2 = "abc";
        System.out.println(s==s2);//burda işler değişiyor heapteki aynı yeri işaret ediyolar

        String blackFriday = "FRIDAY";
        blackFriday = "thursday";
        // heapte yeni değer açılır, friday valuesu kalır
        // stringler immutable olduğu için friday valuesu değiştirilemez
        // friday garbage collector tarafından rehin alınır
        //kopyasını değiştiriyoz sadece primitiveler için
        int number = 99;
        System.out.println(number);
        changeNumber(number);
        System.out.println(number);

        long[] values = {0,0,0};
        System.out.println(Arrays.toString(values));
        changeReference(values);
        System.out.println(Arrays.toString(values));




        


    }

static void changeNumber(int number){

        number = 22;


}
static void changeReference ( long[] values){

        values = new long[3];// bunu yaparsak maindeki orjinal arrayin değişimini önleriz


        values[0]=1;
        values[1]=2;
        values[2]=3;

}
}
