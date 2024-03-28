package collection_api;

import java.util.*;

public class Demo {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(5);

        for (int n : nums){
            System.out.println(n);
        }

        System.out.println(nums);
        System.out.println("-".repeat(15));
        System.out.println(nums.get(2));
        System.out.println("get index of 8: "+nums.indexOf(8));

        Set<Integer> setNums = new HashSet<>();
        setNums.add(6);
        setNums.add(5);
        setNums.add(8);
        setNums.add(5);
        setNums.add(5);
        System.out.println("SETS"+"-".repeat(15));
        //STORES UNİQUE VALUES, NO DUPLICATES

        for(int n: setNums){
            System.out.println(n);
        }

        Set<Integer> treeSet = new TreeSet<>();
        //sorted set, same stuff no duplicates

        Iterator<Integer> values = setNums.iterator();

        while (values.hasNext()){
            System.out.println(values.next());
        }
        //MAPS, HASHMAP
        // (key,value)
        // not ordered

        Map<String,Integer> students = new HashMap<>();
        students.put("Navin",68);
        students.put("harsh",23);
        students.put("sushil",67);
        students.put("kiran",92);

        System.out.println(students);

        System.out.println(students.get("harsh"));

        students.put("harsh",45);
        //it will replace the value of the harsh, keys are unique

        System.out.println(students.keySet());
        for (String name: students.keySet()){
            System.out.println(name + ": "+students.get(name));
        }

        System.out.println(students.values());


        Map<String,Integer> students2 = new Hashtable<>();
        // hashmap vs  hashtable ?? hashtable is syncronized
        // if we are working with multiple threads its better to use hashtable
        // what about sorting

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(9);
        numbers.add(0);
        numbers.add(2);

        Collections.sort(numbers);

        //sort based on last digit
        //if we return 1 it will swap with the compared object
        //if we return -1 it won't swap

        Comparator<Integer> com = new Comparator <Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10>o2%10){
                    return 1;
                }else {
                    return -1;
                }

            }
        };

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(24);
        numbers2.add(96);
        numbers2.add(50);
        numbers2.add(82);

        Collections.sort(numbers2,com);
        System.out.println(numbers2);

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"havin"));
        studs.add(new Student(12,"berk"));
        studs.add(new Student(78,"beko"));
        studs.add(new Student(67,"anıl"));

        Comparator<Student> studentComparator = (o1, o2) -> o1.age > o2.age ? 1 :-1;

/*            if (o1.age>o2.age){
                return 1;
            }else {
                return -1;
            }*/



        Collections.sort(studs,studentComparator);

        for (Student s : studs){
            System.out.println(s);
        }
        // instead of creating comparator here, student class can implement COMPARABLE<STUDENT>,
        // and do the neccessary process in class with implementing compareTo method
        Collections.sort(studs);// we did not need to pass comparator since we did it via comparable
        //we can create various comparators thats good thing to consider




    }

}
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " +
                "age=" + age +
                ", name='" + name;
    }

    @Override
    public int compareTo(Student o) {

        if (this.age>o.age){
            return 1;
        }else {
            return -1;
        }

    }
}