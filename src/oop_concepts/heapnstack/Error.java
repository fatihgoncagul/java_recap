package oop_concepts.heapnstack;

public class Error {


    public static void example(){

        example();// stackoverflow hatası verir
        // çalışmadan önce belli bi yer ayırdığını belirtmen gerek


    }

    public static void main(String[] args) {
       // example();// stackoverflow hatası verir
        // belli bi yer ayırdığını belirtmen gerek

        //peki heapoutofmemory alabilir miyiz
        int[] error = new int[999999999];

        for (int i =0;i<9999999;i++){
            error[i] = i;
        }


    }
}
