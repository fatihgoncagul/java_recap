package oop101;

public class Account {


    /*
    * a constructor is used in creation of an object
    * has the same name as the class itself and it does not return any values
    *
    *  if a class does not have a constructori default constructor is implicitly declared
    * if a class contains other constructor declarations, then default constructor is not declared
    *
    * constructor chainin is when one constructor explicitly calls another overloaded constructor
    * u must use this() statement, and it should be the first executable statement
     */
    private String accountNu;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phone;

    public Account(){
        //this("567",2.50,"defaultName","Default email", "default phone");

        System.out.println("empty constructor called");

    }

    public Account(String accountNu, double balance, String customerName, String customerEmail,String phone){
        System.out.println("account constructor with paramaters called");
        //since initilization might not over yet, using setter methods in a constructor is not suggested
        this.accountNu = accountNu;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phone = phone;

    }

    public Account(String customerName, String customerEmail, String phone) {
        this("999",100.55,customerName,customerEmail,phone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.phone = phone;
    }

    public void deposit(double amount){

        balance += amount;
        System.out.println("deposit of $"+amount+" made. New balance is $"+balance);

    }
    public void withdraw(double amount){
        if (!((balance-amount)<0)){


            balance -= amount;
            System.out.println("withdrawal of $"+amount+" processed, remaining balance = $"+balance);

        }else {
            System.out.println("your balance is " + balance + "you cannot withdraw more than that");

        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNu() {
        return accountNu;
    }

    public void setAccountNu(String accountNu) {
        this.accountNu = accountNu;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


}
