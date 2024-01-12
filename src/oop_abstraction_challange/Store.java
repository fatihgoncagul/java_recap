package oop_abstraction_challange;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> productsForSale =new ArrayList<>();

    public static void main(String[] args) {
        productsForSale.add(new Furniture("oil painting",1350,"Impressive work by ABF painted in 2010"));
        productsForSale.add(new Furniture("sculpture",2000,"Bronz work by JKF, produced in 1950"));

        productsForSale.add(new Furniture("desk",500,"Mahagony Desk"));
        productsForSale.add(new Furniture("lamp",200,"Tiffany Lamp with Hummingbirds"));

        listProducts();
        //orderIndex means index of the product in productsForSale arraylist
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,3,5);
        addItemToOrder(order2,0,1);
        addItemToOrder(order2,2,1);
        printOrder(order2);


    }

    public static void listProducts(){
        for(var item: productsForSale){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    private static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,int qty){
        order.add(new OrderItem(qty,productsForSale.get(orderIndex)));

    }
    private static  void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item: order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n",salesTotal);

    }


}



abstract class ProductForSale{
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty){
        return qty*price;
    }
    public void printPricedItem(int qty){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",qty,price,type,description);
    }
    public abstract void showDetails();

}
class ArtObject extends ProductForSale{


    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        //we can directtly acces it cause we made fields "protected"
        System.out.println("this " + type + " is a beautiful reproduction");
        System.out.printf("the price of the piece $%6.2f %n",price );
        System.out.println(description);
    }
}
class Furniture extends ProductForSale{


    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        //we can directtly acces it cause we made fields "protected"
        System.out.println("this " + type + " was manufactured in North Carolina ");
        System.out.printf("the price of the piece $%6.2f %n",price );
        System.out.println(description);
    }
}