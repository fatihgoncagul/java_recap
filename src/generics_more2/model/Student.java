package generics_more2.model;

import generics_more2.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID = 10_000;
    private int studentId;

    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames ={"ann","bill","cath","john","tim"};
    private static String[] courses = {"C++","java","python"};

    public Student(){
        studentId = LAST_ID++;
        int lastNameindex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)]+" "+ (char)lastNameindex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);

    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId,name,course,yearStarted);

    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fname= fieldName.toLowerCase();
        return switch (fname){
            case "name" -> name.equalsIgnoreCase(value);
            case "course" -> course.equalsIgnoreCase(value);
            case "yearstarted" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentId).compareTo(o.studentId);
    }
}
