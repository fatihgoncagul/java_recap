package nested_classes_types.domain;

import java.util.Comparator;

/*
*
* we want employee class to be generic meaning that we want it to accept Employee type or subtype of employee type
* this is why we wrote this
* */

public class EmployeeComparator <T extends Employee_nested> implements Comparator<Employee_nested> {

    @Override
    public int compare(Employee_nested o1, Employee_nested o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
