package oop101;

public class Customer {
// practice
    private String customerName;
    private double creditLimit;
    private  String email;



    public Customer(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("nobody","nobody@");

    }

    public Customer(String customerName, String email) {
        this(customerName,0,email);//calling another constructor instead of writing more lines like below
//        this.customerName = customerName;
//        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        Customer customer = new Customer("tim",100,"tim@gmail.coö");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getCustomerName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("fatih","fth@gmail.com");
        System.out.println(thirdCustomer.getCustomerName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
