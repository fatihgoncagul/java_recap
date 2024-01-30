package nested_classes_types.domain;

import java.util.Comparator;

public class StoreEmployee_inner extends  Employee_nested{

    private String store;

    public StoreEmployee_inner() {

    }

    public StoreEmployee_inner(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store,super.toString());
    }

    public class StoreComparator<T extends StoreEmployee_inner> implements Comparator<StoreEmployee_inner>{


        @Override
        public int compare(StoreEmployee_inner o1, StoreEmployee_inner o2) {
            int result = o1.store.compareTo(o2.store);
            if (result==0){
                return new Employee_nested.EmployeeComparator<>("yearStarted").compare(o1,o2);

            }
            return result;
        }
    }

}
