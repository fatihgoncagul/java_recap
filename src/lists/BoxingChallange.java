package lists;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

}

public class BoxingChallange {
    public static void main(String[] args) {

        Customer bob = new Customer("bob s", 1000.0);
        System.out.println(bob);
        Bank bank = new Bank("chase");
        bank.addNewCustomer("jane",500.00);
        System.out.println(bank);
        bank.addTransaction("jane",-10.25);
        bank.addTransaction("jane",-50.00);
        bank.printStatement("jane");
        bank.addNewCustomer("bob",25.00);
        bank.addTransaction("bob",250);
        bank.printStatement("bob");


    }

}

class Bank {

    String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }

        }
        System.out.println("customer (" +customerName+") was not found.");
        return null;
    }
    public void addNewCustomer(String customerName,double initialDeposit){
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("new customer added: " + customer);
        }

    }
    public void addTransaction(String name, double transaction){
        Customer customer = getCustomer(name);
        if (customer!=null){
            customer.transactions().add(transaction);
        }
    }
    public void printStatement(String customerName){
    Customer customer = getCustomer(customerName);
    if (customer == null){
        return;
    }
        System.out.println("-".repeat(20));
        System.out.println("Customer name:" + customer.name());
        System.out.println("transactions");

        for(var transaction: customer.transactions()){
            System.out.printf("$%10.2f (%s)%n",transaction,transaction<0 ? "debit" : "credit");
        }
    }
}