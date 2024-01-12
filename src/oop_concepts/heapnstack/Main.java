package oop_concepts.heapnstack;

public class Main {


    public static void main(String[] args) {
        //hangi değişkenler heapte hangileri stackte tutulur vs
        // heap and stack ramin mantıksal yapısı
        // primitive ve referans tiplerin karşılaştırılması stack ve heapteki konumları
        /*
        * stackin boyutu büyük değil LIFO,
        * her threadin bir stacki oluyo
        * heap tarafında aynı şey söylenemez
        * her thread kendi stackine ve başka stacklare erişebileceğini görücez
        * heapte  array, classes and interfaces tutulur(değerleri), memory adressi stackte tutşluyor
        * threadlerin heap ve stack bağlantısına bakıcaz
        *
        *
        * */

        int price = 0;
        System.out.println(price);

        int total = price;
        System.out.println(total);

        // priceı değştirince total de değişcek mi
        price = Integer.MAX_VALUE;
        System.out.println(price);
        System.out.println(total);
        //burda totalde değişiklik olmuyor çünkü değeri kopyaladık


    }

}
