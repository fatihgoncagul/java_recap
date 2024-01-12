package lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* lists take the arrays we work to the next level. they allow us to change the
* number of elements defined in array but there are other imporvements as well
* common ones are arraylist and linkedlist
* list is an interface
* others List classes implement List interfaces methods
*
* The ArrayList is a class, that really maintains an array in memory, that's
* actually bigger than what we need in most cases
* It keeps track of the capacity, which is the actual size of the array in memory
* it also keep track of the elements we assigned which iss the size of the arraylist
* when elements added to arraylist its capacity grows automatically
*
*
*
*
*
* */
record GroceryItem(String name, String type,int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type );
    }
}
public class ListsAndArraylist {



    public static void main(String[] args) {

        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1]=new GroceryItem("apples","produce",6);
        groceryItems[2]=new GroceryItem("oranges","produce",7);
        System.out.println(Arrays.toString(groceryItems));

        ArrayList<GroceryItem> groceryItemArrayList = new ArrayList<>();
        groceryItemArrayList.add(new GroceryItem("butter"));
        groceryItemArrayList.add(new GroceryItem("yoghurt","produce",5));
        groceryItemArrayList.add(new GroceryItem("banana"));
        groceryItemArrayList.add(0,new GroceryItem("abc"));

        System.out.println(groceryItemArrayList);

        groceryItemArrayList.remove(1);


        // List.of usage: returns immutable list
        ArrayList<String> groceries = new ArrayList<>(
                List.of("yoghurt"));
        System.out.println(groceries);


        ArrayList<String> nextList = new ArrayList<>(
                List.of("mustard","cheese","pickles"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("third items: "+groceries.get(2));

        if (groceries.contains("mustard")){
            System.out.println("list contains mustard");
        }

        groceries.add("yoghurt");
        groceries.add("apples");
        groceries.add("pickles");
        System.out.println("first occurence index:"+groceries.indexOf("yoghurt"));
        System.out.println("last occurence index:"+groceries.lastIndexOf("yoghurt"));


        groceries.remove("yoghurt");//removes only one
        groceries.removeAll(List.of("apples","pickles"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","mustard","cheese"));//bunun dışımdakileri siler, bunları korur        System.out.println(groceries);

        groceries.clear();
        System.out.println();

        System.out.println(groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","mustard","cheese","pickles","ham"));

        System.out.println();
        groceries.sort(Comparator.naturalOrder());
        System.out.println("sorted"+groceries);
        groceries.sort(Comparator.reverseOrder());//reverse order sort also exist

        var groceryArray = groceries.toArray(new String[groceries.size()]);

        System.out.println("grocery arraylist into array:\n "+Arrays.toString(groceryArray));

        //asList usage : returns not resizeable but mutable
        String[] originalARR = {"first","second","third"};
        var originalList = Arrays.asList(originalARR);//this list is not resizable cause its backed by original array's array
        //birindeki değişiklik diğerinde de gözükyüor
        //arrayle desteklendiği için add remove gibi şeyler kullanamıyosun

        List<String> stringList = Arrays.asList("sunday","monday","tuesday");
        System.out.println(stringList);












    }
}
