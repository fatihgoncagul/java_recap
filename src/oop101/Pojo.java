package oop101;
/*
* a plain old java object whose acronym is pojo is a class that
* generally only has instance fields
* its used to house data and pass data between functional classes
* it usually has few, if any methods other than getters and setters
* it can be used database frameworks read or write data do databases
* files or streams
* it might also can be called a bean or JavaBean
* A javabean is just a pojo with some extra rules applied to it
* a pojo is sometimes called entity, because it mirrors database entities
* its a description of an object that can be modeled as just data
* we call pojo boiler plate code
*
*
* */


 class Pojo {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Pojo(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getDateOfBirth() {
         return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth) {
         this.dateOfBirth = dateOfBirth;
     }

     public String getClassList() {
         return classList;
     }

     public void setClassList(String classList) {
         this.classList = classList;
     }

     //overriden method means that other classes can implement if they specify annotation
    @Override
    public String toString() {
        return "Pojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }



}
 class Main3{

    public static void main(String[] args) {

        for (int i=1;i<=5;i++){
            Pojo student = new Pojo("s5632"+i,
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



    }



}