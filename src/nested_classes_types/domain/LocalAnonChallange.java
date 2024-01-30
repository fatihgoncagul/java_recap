package nested_classes_types.domain;

// challange is to use a locall class to manipulate data and add functionality

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Employee(String firtstName, String lastName, String hireDate){}

public class LocalAnonChallange {

    public static void main(String[] args) {

        Employee e1 = new Employee("minnie","mouse","01/05/2015");
        Employee e2 = new Employee("mickie","mouse","01/08/2000");
        Employee e3 = new Employee("daffy","duck","11/02/2011");
        Employee e4 = new Employee("daisy","duck","05/03/2013");
        Employee e5 = new Employee("goofy","dog","23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
        printOrderedList(list,"name");
        System.out.println("-".repeat(30));
        printOrderedList(list,"yearsWorked");

    }
    public static void printOrderedList(List<Employee> eList, String sortField){


        int currentYear = LocalDate.now().getYear();

        class MyEmployee{


            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firtstName(), containedEmployee.lastName());

            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName,yearsWorked);
            }
        }



    List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : eList){

            list.add(new MyEmployee(employee));
        }
        //Unlikle the locall class, which we used to create many instances of, we really need one
        //instance of this class for a finite purpose to change the way these
        //employees are sorted
        var comparator = new Comparator<MyEmployee>(){
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")){
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked-o2.yearsWorked;
            }
        };

        list.sort(comparator);
        for (MyEmployee myEmployee:list){
            System.out.println(myEmployee);
        }

    }

}
