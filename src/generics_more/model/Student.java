package generics_more.model;

import generics_more.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem {

    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames ={"ann","bill","cath","john","tim"};
    private static String[] courses = {"C++","java","python"};

    public Student(){
        int lastNameindex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)]+" "+ (char)lastNameindex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);

    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStarted);

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
}
