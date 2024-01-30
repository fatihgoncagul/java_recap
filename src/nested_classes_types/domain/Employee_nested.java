package nested_classes_types.domain;

import java.util.Comparator;

public class Employee_nested {

//STATIC NESTED CLASS
    public static class EmployeeComparator <T extends Employee_nested> implements Comparator<Employee_nested> {

        private  String sortType;

    public EmployeeComparator() {
        this("name");
    }

    public EmployeeComparator(String sortType) {

        this.sortType = sortType;
    }

    @Override
        public int compare(Employee_nested o1, Employee_nested o2) {
           // return o1.getName().compareTo(o2.getName());

        if (sortType.equalsIgnoreCase("yearStarted")){
            return o1.yearStarted-o2.yearStarted;
        }

        return o1.name.compareTo(o2.name);
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee_nested(){
    }

    public Employee_nested(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%-8d %-8s %d".formatted(employeeId,name,yearStarted);
    }
}
