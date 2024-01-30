package comparator_comparable;

/*
*
* comparable is an interface with compareTo method x.compareTo(T o)
* comparator is also an interface with compare(T o1,T o2) method
* it's common practice to include a Comparator as a nested class
*
* */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others ={0,5,10,-50,50};

        for (Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n",five,
                    (val==0 ? "==": (val<0) ? "<":">"),i,val);
        }
        String banana = "banana";
        String[] fruit = {"apple","banana","pear","BANANA"};

        for(String s : fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n",five,
                    (val==0 ? "==": (val<0) ? "<":">"),s,val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"),new Student("Tim"),new Student("Ann")};
        Arrays.sort(students);



        System.out.println(Arrays.toString(students));
       // System.out.println("result = " + tim.compareTo("Mary"));//this line will give error if we override compareTo via casting parameter to student,
        //after setting type parameter this line gives compiler error

        Comparator<Student> gpaSorter = new StudentGpaComparator();

        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));


    }



}

class StudentGpaComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa+o2.name);
    }
}
class Student implements Comparable<Student>{
    String name;

    private static int LAST_ID =1000;

    private static Random random = new Random();

    protected Double gpa;

    private int id;

    public Student(String name) {
        this.name = name;
        id  = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);


    }

    @Override
    public String toString() {
        return  "%d - %s (%.2f)".formatted(id,name,gpa) ;

    }
    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}