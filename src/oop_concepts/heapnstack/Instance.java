package oop_concepts.heapnstack;



/*
*
* type of variables: local, instance, static
* instance dediğimiz variablelar, sınıf seviyesindeki değişkenlerdir
*
*
* */
public class Instance {

    String name;
    int id;
    int note;
    boolean abc;

    public Instance(String name, int id, int note, boolean abc) {
        this.name = name;
        this.id = id;
        this.note = note;
        this.abc = abc;
    }
    //instance variableların default valueları vardır
    //instance variablelara doğrudan erişim yoktur, obje aracılığla erişiriz

    public static void main(String[] args) {

        Instance instance = new Instance("abc",1,2,false);

        int a; // local variable // default value'su yok





    }








}
