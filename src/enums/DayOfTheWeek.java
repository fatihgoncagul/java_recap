package enums;

import java.util.Random;

/*
*
* Enumeration
the enum type is java's type to support something called enumeration
a complete ordered listing of all the items in a collection
a special data type that contains predefined constants
a constant is a variable whose value can't be changed, once it's value has been assigned
*so an enum is a little like an array, except its elements are known, not changeable
and each element can be referred by a constant name, instead of an index position


* an enum in its simplest form is described like class,
* but keyword enum replaces the keyword class
*
* simplify code, more readebla code etc
*
*
*
* */
public enum DayOfTheWeek{
     MON,TUES,WED,THU,FRI,SAT,SUN
}

class Enums {

    public static void main(String[] args) {

        DayOfTheWeek weekDay= DayOfTheWeek.TUES ;
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
/*            System.out.printf("name is %s, ordinal value = %d%n",weekDay.name(),weekDay.ordinal());

            if (weekDay==DayOfTheWeek.FRI){
                System.out.printf("found a friday");
            }*/
            switchDayOfTheWeek(weekDay);
        }

        for(Topping topping: Topping.values()){
            System.out.println(topping.name()+": "+ topping.getPrice());
            //enums are constants and we can easily change something for each element in enum.
        }




    }


    //switch statement usage with enum

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay){

        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is "+ weekDayInteger);
            case SAT -> System.out.println("Saturday is "+ weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+
                    weekDay.name().substring(1).toLowerCase()+
                    "day is Day "+weekDayInteger);

        }

    }



    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

}
