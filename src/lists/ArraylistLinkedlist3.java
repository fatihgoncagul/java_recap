package lists;

// if we add element to the arraylist the next operation is gonna
/*
* create new array, with more elements but  copy the existing elements over
* this add ops costs more, in both time and memory
* when java reallocates new memory for the arraylist
* it automatically sets the capacity to a greater capacity
* growth policy are not specificed but has constant amortized time cost
* cost is generally considerd time but may include memory usage and processing costs etc
* big o approximates the cost of an operation, for a certain number of elemnts, called n.
* In many situations an op's cost is in direct correlation to the number of elemnents n
* In big o nataion this is O(n) sometimes called linear time
* O(n) is generally worst case scenerio
* constant amortized cost of Java docs: O(1)*
* This means mostly its close to O(1), but at certain intervals its O(n)
* if we exceed capacity when adding arraylist cost is O(n)
* ---------------------------------------------------
* LinkedLists
* LinkedList is not indexed
* there is no array, storing the adresses in a neat ordered way
* instead, each element thats added to a linked list, forms a chain, and
* the chain has links to the previous element, and the next element
* this architecture called doubly linked list
* the beginning of the chain is head of the list, the end is called the tail
* this can also be considered a queue, in this case, a double ended queue, cause
* we can travers backwards and forwards
* getting an element from the list or setting a value of element is not just simple math with linked list tyoe
*
* to find an element, we would need to start athe head or tail, and check if the element
* matches, or keep track of the number of elements traversed, if we are matching by an index
* cause the index is not stored as a part of the list
*
* for example even şf you know you want to find 5th element you'd still have to traverse the chain this way
*
* this type of retrieval is considered expensive,
* on the other hand, inserting and removing an element is much simpler for linkedlist
* breaking two links and re establishing different links
* no new array needs to be created, and elements dont need to be shifted into different
* positions
* inserting and removing is cheap for linkedlist
*
* if you are gonna store and read data arraylist might be a good chocice
* but if you are gonna change content of the data or add or remove data occasionaşly
* that means linked list might be a better choice
*
* ** An arraylist implemented on top of an array, but a linkedlist is a doubly linked list
* both implement all of list's method, linkedlist also implements queue and stack methods as well
* queue is a fifo data collection, poll is like removefirst, offer is like adding end of the queue
* A double-ended queue allows acces to both start and end of the queue
* when you think of a stack think of a vertical pile of elements on top of one another
* stack is a lifo data collection
*
*
*
*
*
*
*
* */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistLinkedlist3 {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        var places = new LinkedList<String>();
        places.add("sydney");
        places.add(0,"canberra");
        System.out.println(places);
        addMoreElements(places);
        System.out.println(places);
       // removeElements(places);
        System.out.println(places);
       // gettingElements(places);
        printItinerary(places);
        printItinerary2(places);
        printItinerary3(places);
        testIterator(places);


    }


    private static void gettingElements(LinkedList<String> list){
        // retrieving is O(1) in arraylist but in linkedlist is O(n), but its not that bad, java decides where to start whichever link closest to target index
        System.out.println("retrieved element: "+list.get(4));
        System.out.println("first element: "+list.getFirst());
        System.out.println("last element: "+list.getLast());

        System.out.println(list);
        System.out.println("darwin in index: " + list.indexOf("darwin"));
        System.out.println("melbourne in index: "+list.indexOf("melbourne"));

        //Queue retrieval method
        System.out.println("queue retrival,element from element()"+list.element());
        //stack retrieval methods
        System.out.println("element from peek: "+list.peek());
        System.out.println("element from peekFirst: "+list.peekFirst());
        System.out.println("element from peekLast: "+list.peekLast());


    }

    private static void printItinerary(LinkedList<String > list){

        System.out.println("trip starts at: "+list.getFirst());
        for (int i = 1; i < list.size(); i++) {

            System.out.println("---> from " + list.get(i-1)+" to " + list.get(i));
        }
        System.out.println("trip ends at: " + list.getLast());


    }
    private static void printItinerary2(LinkedList<String > list){

        System.out.println("trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        for (String town: list) {

            System.out.println("---> from " + previousTown+" to " + town);
            previousTown = town;
        }
        System.out.println("trip ends at: " + list.getLast());


    }
    private static void printItinerary3(LinkedList<String > list){

        System.out.println("trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();

            System.out.println("---> from " + previousTown+" to " + town);
            previousTown = town;
        }
        System.out.println("trip ends at: " + list.getLast());


    }

    //using iterator/listIterator
    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        System.out.println("before removing brisbane: "+list);
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            if (iterator.next().equals("brisbane")){
                //list.remove() usage gives error concurrent modification exception

                iterator.remove();
                //iterator only supports remove method and forwards
                //we change it to list iterator now we can go forwards and backwards and remove,add,set
                iterator.add("lake");
            }
        }
        // for "iterator" if we wanna use same iterator instance we can't cause its false
        // but since we have "listIterator" we can go backwards
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
        System.out.println("moving iterator at start");
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());



    }

    private static void  addMoreElements(LinkedList<String> list){
        list.addFirst("darwin");
        list.addLast("antalya");
        //queue method
        list.offer("melbourne");
        list.offerFirst("brisbane");
        list.offerLast("toowomba");
        //stack methods
        list.push("alice springs");





    }

    private static void removeElements(LinkedList<String> list){


        list.remove(4);
        list.remove("brisbane");

        System.out.println(list);
        String s1 = list.remove();//removes first element and returns, stack method
        System.out.println(s1 +" was removed");

        String s2 = list.removeFirst();
        System.out.println(s2+" was removed");

        String s3 = list.removeLast();
        System.out.println(s3+" was removed");
        //QUEUE DEQUEUE POLL METHODS
        String p1= list.poll();
        System.out.println(p1+" was removed");
        String p2= list.pollFirst();
        System.out.println(p2+" was removed");
        String p3= list.pollLast();
        System.out.println(p3+" was removed");

        list.push("sydney");
        list.push("brisbane");
        list.push("canberra");
        System.out.println(list);
        String s4 = list.pop();
        System.out.println(s4+" was removed");



    }


}
