package nested_classes_types;

import nested_classes_types.domain.EmployeeComparator;
import nested_classes_types.domain.Employee_nested;
import nested_classes_types.domain.StoreEmployee_inner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {


    public static void main(String[] args) {

        List<StoreEmployee_inner> storeEmployees = new ArrayList<>(List.of(new StoreEmployee_inner(10015, "meg", 2019, "target"),
                new StoreEmployee_inner(10515, "joe", 2021, "walmart"),
                new StoreEmployee_inner(10215, "marty", 2018, "walmart"),
                new StoreEmployee_inner(10322, "bud", 2016, "targert"),
                new StoreEmployee_inner(10105, "tom", 2020, "macys")));


        var c0 = new EmployeeComparator<StoreEmployee_inner>();
        var c1 = new Employee_nested.EmployeeComparator<StoreEmployee_inner>();
        var c2 = new StoreEmployee_inner().new StoreComparator<StoreEmployee_inner>();

        //using local class
        class NameSort<T> implements Comparator<StoreEmployee_inner>{
            @Override
            public int compare(StoreEmployee_inner o1, StoreEmployee_inner o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        var c3 = new NameSort<StoreEmployee_inner>();

        // using anonymous class
        var c4 = new Comparator<StoreEmployee_inner>(){
            @Override
            public int compare(StoreEmployee_inner o1, StoreEmployee_inner o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        sortIt(storeEmployees,c0);
        sortIt(storeEmployees,c1);
        sortIt(storeEmployees,c2);
        sortIt(storeEmployees,c3);
        sortIt(storeEmployees,c4);
        sortIt(storeEmployees,new Comparator<StoreEmployee_inner>(){
            @Override
            public int compare(StoreEmployee_inner o1, StoreEmployee_inner o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        sortIt(storeEmployees, Comparator.comparing(Employee_nested::getName));


        //Anonymous class extends StoreEmployee class meaning its a subclass of StoreEmployee
        var e1 = new  StoreEmployee_inner() {

        };

    }

    public static  <T> void  sortIt(List<T> list, Comparator<? super T> comparator){


        System.out.println("sorting with comparator: "+ comparator.toString());
        list.sort(comparator);
        for (var employee: list){
            System.out.println(employee);
        }
        System.out.println();

    }


}
