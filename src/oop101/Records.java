package oop101;


/*
* the record type once created its rarely looked at
* its part of jdk 16
*the record is a special class that contains data, that is not meant to be altered
*it contains only most fundemental methods such as constructors and accessors
* best of all the developer dont have to write or generate any of thişs code
*
*
* */

public class Records {

    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            LPAStudent student = new LPAStudent("s5632"+i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "carol";
                        case 3 -> "tim";
                        case 4 -> "harry";
                        case 5 -> "lisa";
                        default -> "anonymous";
                    },
                    "05/05/1985",
                    "java masterclass");
            System.out.println(student);
        }
        Pojo student2 =  new Pojo("s5632",
                "MARY",
                "05/05/1985",
                "java masterclass");
        LPAStudent recordstudent3 =  new LPAStudent("1234",
                "XXX",
                "555/55/5555",
                "java masterclass");
        System.out.println(student2);
        System.out.println(recordstudent3);

        System.out.println(student2.getName());
        System.out.println(recordstudent3.name());


        student2.setClassList(student2.getClassList()+"java spring");
        //we cannot do addition,record type is immutable
        //immutable type is useful when we want to protect the data from unintented mutations
        //if we want to modify data on our class we wont be using record type
        //but if we are reading lots of records from database
        //and simply passing this data around then the record is big improvement





    }

}
