package inheritance_practice;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("age: " + tim.getAge() );
        System.out.println("pay: "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe","11/11/1990","03/03/2020",35000);
        System.out.println(joe);
        System.out.println("joe's paycheck = $" + joe.collectPay());


        joe.retire();
        System.out.println("joe's pension check = $"+joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("mary","05/07/1970","03/03/2021",15);

        System.out.println(mary);
        System.out.println("mary's paycheck = $" + mary.collectPay());
        System.out.println("mary's holiday pay = $"+mary.getDoublePay());

    }
}
