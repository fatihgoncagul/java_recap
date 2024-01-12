package oop_inheritance;

/*
*
* we weere using inheritance all along
* special java class called Object
* OopInheritance.Student@6d03e736 hashcode is an integer that is unique to an instance in the curenntly executing code
*
* primary school cant override from the object class if student class already overwrote it. It can over
* write it through overwritten method in student
*
*
* */


public class TheBaseClass extends Object{

    public static void main(String[] args) {
        Student max = new Student("MAX",32);
        System.out.println(max);
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy",8,"Carol");
        System.out.println(jimmy);
    }

}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}
class PrimarySchoolStudent extends Student{


    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName +"'s kid, " + super.toString();
    }
}