package oop_concepts.lec101;

import java.util.Scanner;

public class Association {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Bank bankTwo;
        Bank bank = new Bank("Axis");
        Employee employee = new Employee("Neha");

        System.out.println(employee.getName() + " is employee of " + bank.getBankName());


    }


}
