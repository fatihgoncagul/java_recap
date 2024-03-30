package optional_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

    private String name;
    private int age;



    public Student() {
    }

    public Student(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name=" + name +
                ", age=" + age ;

    }
}

public class MethodRefEx {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("navin", "laxmi", "john", "kishor");


        List<String> uNames = names.stream()
                .map(String::toUpperCase) // method reference, it applies for every element
                .toList();


        System.out.println(uNames);

        uNames.forEach(System.out::println);

        // Constructor reference

        List<Student> students = new ArrayList<>();

        for(String name: names){
            students.add(new Student(name));
        }
        System.out.println(students);

        students = names.stream()
                .map(Student::new)// name ->new Student(name)
                .toList();



    }

}
