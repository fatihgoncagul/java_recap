package basics_review;

public class Base {



    /*

nonprimitive: String array etc.
primitive : boolean char byte int long float double
ilkeller dışında her şey classdab oluşuyor


String referans türüdür, non primitivedir




   */

    public static void main(String[] args) {

        //region variable initialization
        boolean flag = true;
        char ch = 'a';
        byte b = 12;
        short s = 24;
        int i = 257;
        long l = 890L;
        float f = 3.1314F;
        double d = 2.1828;
        double g  ;
        //endregion

        //region printing to the screen
        System.out.println("flag = " + flag);
        System.out.println("ch = " + ch);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        //endregion


        String x = new String("Hello");
        //eğer aynı str varsa içinde JVM ona yönlendiriyor
        String y = "Hello";



    }
    //NONprimitive olan tiplerin Stringi initialize etmezsek null oluyor, null pointer exception hatası bu yüzden oluşuyor, nerede değer almamış olabilirle çözüme ulaşılabilir
    // primitive typeların default valuesu var
    // instance ve local variable değer atamaları
    // local variablelara neden default değer alınamıyo
    // instance variablelar nasıl default değeriyle initialize ediliyo
    // son iki commente ilerde bakıcaz
    // genel tekrar slaytı İNCELENBEBİLİR
    //bytedda -128,127
    // 127YE +1 eklersek byte için, -kısmına dönüyo çember halinde
    //NON PRIMITIVE tip değişkenişin default değeri null dır
    //



}
