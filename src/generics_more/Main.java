package generics_more;

import generics_more.model.LPAStudent;
import generics_more.model.Student;
import generics_more.util.QueryItem;
import generics_more.util.QueryList;

import java.util.ArrayList;
import java.util.List;
record Employee(String name) implements QueryItem{

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}
public class Main {

    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i =0;i<studentCount;i++){
            students.add(new Student());
        }
//        printList(students);
        printMoreList(students);


        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i =0;i<studentCount;i++){
            lpaStudents.add(new LPAStudent());
        }
//        printList(lpaStudents);
        printMoreList(lpaStudents);
        testList(new ArrayList<String>(List.of("able","barry","charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));


        var querlylist = new QueryList<>(lpaStudents);
        var matches = querlylist.getMatches("course","python");
        printMoreList(matches);


        var students2021 = QueryList.<Student>getMatches(students,"yearstarted","2021");
        printMoreList(students2021);

        //multiple inheritence of generic class type parameterr usage, check querylist class
        // below code line is not in its bound!
        //QueryList<Employee> employeeList = new QueryList<>();


    }



/*    public static void testList(List<String> list){
        for (var element: list){
            System.out.println("String: "+ element.toUpperCase());
        }
    }
    public static void testList(List<Integer> list){
        for (var element: list){
            System.out.println("Integer: "+ element.floatValue());
        }
    }*/

    public static void testList(List<?> list){
        for (var element: list){
            if (element instanceof String s){
                System.out.println("String: "+ s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: "+ i.floatValue());
            }

        }
    }



// ? extends Student is called wildcard
    //when u use wildcard u use it for functionalities specific to the object you are dealing with
    //but when u use generic method u use for data manipulating operations involved, for example changing the list etc
    public static  void printMoreList(List<? extends Student> students){


        for (var student:students){
            System.out.println(student);

        }
        System.out.println();

    }
    //GENERIC METHOD
//    public static <T extends Student> void printList(List<T> students){
//
//
//        for (var student:students){
//            System.out.println(student.getYearStarted() + ": "+student);
//            System.out.println();
//        }
//        System.out.println();
//
//    }

}
