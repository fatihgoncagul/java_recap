package nested_classes_types;

import nested_classes_types.domain.Employee_nested;
import nested_classes_types.domain.StoreEmployee_inner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Employee_nested> employees = new ArrayList<>(List.of(
                new Employee_nested(10001, "ralph", 2015),
                new Employee_nested(10005, "carole", 2021),
                new Employee_nested(10022, "jane", 2013),
                new Employee_nested(10151, "laura", 2020),
                new Employee_nested(1050, "jim", 2018)
        ));
//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        // we added this comparator class inside the employee class as static and
        //then we could use private attributes of employee class, also added sortType
        // using this nested class, provided us encapsulate the outer class, without providing getter setter methods

        employees.sort(new Employee_nested.EmployeeComparator<>("yearStarted").reversed());


        for (Employee_nested e : employees) {
            System.out.println(e);
        }

        System.out.println("Store members");

        List<StoreEmployee_inner> storeEmployees = new ArrayList<>(List.of(new StoreEmployee_inner(10015, "meg", 2019, "target"),
                new StoreEmployee_inner(10515, "joe", 2021, "walmart"),
                new StoreEmployee_inner(10215, "marty", 2018, "walmart"),
                new StoreEmployee_inner(10322, "bud", 2016, "targert"),
                new StoreEmployee_inner(10105, "tom", 2020, "macys")));
        System.out.println("-".repeat(30));
        //var genericEmployee = new StoreEmployee_inner();
        // IF WE USE INNER CLASS WE NEED TO CALL THE COMPARATOR WITH NEW KEYWORD;
        // IN STATIC NESTED CLASS WE CALL IT DIRECTLY WITHOUT NEW KEYWORD
        var comparator = new StoreEmployee_inner().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee_inner e : storeEmployees) {
            System.out.println(e);
        }

        // TO create an inner classes instance, first u need to create the instance of enclosing Class
        StoreEmployee_inner outerClass = new StoreEmployee_inner();
        StoreEmployee_inner.StoreComparator innerClass = outerClass.new StoreComparator();
        System.out.println("with pig latin names ");
        addPigLatinName(storeEmployees);


    }
    //LOCAL CLASSES: its like inner classes we use them in methods without acces modifiers
    // remember ? is wild card on generics it means it will only accept StoreEmployee's or subtypes of it to the list
    // we just wanted to add a behavior just for this method, we did not want to change all of the super classes structrure
    // variables used in local classes must be final or effectively final (meaning that they must be assigned and nevere changed afterwards)

    // as of jdk 16, we can also create local record, interface and enum type in our method block
    //these are implicitly static types and therefore are not inner classes or types but
    //static nested types
    
    public static void addPigLatinName(List<? extends StoreEmployee_inner> list) {

        String lastName = "Piggy";
        class DecoratedEmployee extends StoreEmployee_inner
                implements Comparable<DecoratedEmployee> {

            private String pigLatinName;
            private Employee_nested originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee_nested originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }
        newList.sort(null);// if we pass null to sort method it will use compareTo method of COMPARABLE
        //we can just pass Comparator.naturalorder()
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
        }


    }


}
