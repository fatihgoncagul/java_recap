package basics;

public class TypeCasting {


    // primitive to primitive
    //1widening
    // byte >short> int> long> float> double//küçük boyuttan büyük boyuta geçiş easy
    // narrowing
    // byte<short<int<long<float<double
    //details
    // long - float and double


    public static void main(String[] args) {

        int i = 5;
        double d = i;
        System.out.println(d);
        //ama büyük boyutlu veri tipinden küçük boyutlu veri tipine geçerken kısmamız lazım,
        double d1 = 5.2;
        int i1 = (int) d1;
        System.out.println(i1);
        //char
        char c2 ='A';
        int i2 = c2;
        System.out.println(i2);//ascii değerini veriyor
        System.out.println("CHAR C2  "+c2);
        //intten chara geçebiliyoruz
        //floattan chara geçerken cast etmeden yaoabilir miyiz hayır

        float f3 = 65f;
        char c3 = (char)f3;
        System.out.println(c3);
        //long 8 byte, float 4 byte tututor
        //long tam sayı tutuyor//float ondalık tutuyor

        float f4 = 10.65f;
        long l4 = (long)f4;
        System.out.println(l4);

        int fahreneit = 100;
        int celcius = (int) ((fahreneit-32)*5.0/9.0);
        System.out.println(celcius);


        short s5 = 127 ; // 0000 0000 0111 1111
        byte b5 = (byte) s5; // 0111 1111
        System.out.println("b5 " +b5);
        // shorta 128 dersek bytea çeviremiyoruz çünkü byte en fazla 127 tutuyor 1 byte = 8 bit
        short s6 = 128 ; // 0000 0000 1000 0000
        byte b6 = (byte) s6; // 0000 0000
        System.out.println(b6); // -128 vercek most significanbt biti alıcak

        float f7 = 128f;
        char c7 = (char) f7;
        System.out.println(c7);

        int  i8 = 711591040 ;// 0010 1010 0110 1010 0000 0100 1000 0000
        byte b8 = (byte) i8; // son 8 biti alcak gerisinin önemi yok 1000 0000
        //-128 vercek
        System.out.println(b8);

        int i9 = 229179458;
        char c9 = (char) i9;// two bytes, bu da son 16 biti alcak//ascii karaktere çevircek char olduğu için
        System.out.println(c9);
        System.out.println((short)i9+"ascii de 66 B karakteri demek");

        // int 4 byte , byte 1 byte (-128 127)

        int i10 = 20005;
        byte b10 = (byte) i10;
        System.out.println("20 005 sayısının bitwise yazılımının son 8 bitini alıcak\n çünkü byte 8 bit tutabiliyo "+b10);

        //string to primitive and primitive to string

        int i11 = 5;
        String str11 = String.valueOf(i11);
        String str12 = Integer.toString(i11);
        String str13 = "" + i11;

        String str114 = "55";
        int i12 = Integer.parseInt(str114);
        // long 8 byte tutuo double da 8 tutuyo, longtan doublea geçişte neden problem yok?
        // double bazı bitleri noktadan sonraki kısım için kuyllanıyo??inceleyelm

        //why does java imlicitly (without cast) convert long to a float
        //>
        long l = 125486325755L;
        float f = l;
        System.out.println(f);
        //loss of magnitudeda cast lazım
        //loss of precisionda cast e gerek yok izin veriyor
        //long to double için de diyebiliriz

        int i50 = '5';
        System.out.println(i50);//ascii değerini yazıyho
        int a20 = '2';
        char b20 = (char) a20;
        System.out.println(b20);//char 2 yazdırıyor














    }
}
