package lists;


import java.util.LinkedList;

/*
* there are other alternatives for traversing lists
* Iterator and ListIterator
*
* iterator.next() to get the next element in the list
* iterator.hasNext() to check if any elemets remain in the list
* iterator is forwards only, and supports only remove method
*
* On the otherhand ListIterator can be used for backwards and forwards,
* in addition to remove methods, it supports add and set methods
* remembeer, cursor is between elements!!!
*
*
* */
public class Iterators {


    public static void main(String[] args) {

    }
    //using iterator
    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);

    }
}
