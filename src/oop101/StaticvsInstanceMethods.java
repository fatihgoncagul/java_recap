package oop101;
/*
*
* static methods cant acces instance methods or variables directly
* they cant use this keyword, theyre used for ops that dont require
* any data from an instance of the class
* instance methods belong to an instance, of a class
* to use an instance method we have to instantiate the class first with new keyword
* instance methods, can access intstance methods and instance variables directly
* instance methods can also acces static methods and static variables directly
*
* if we are not using any instance variable or instance methods, it should
* probably be a static method, other than that instance method
*
*
*
* */
class StaticvsInstanceMethods {

    public  static void printSum(int a,int b){
        System.out.println("sum=" + (a+b));

    }


}
class Main2{


    public static void main(String[] args) {
        StaticvsInstanceMethods.printSum(5,10);//class ismiyle direkt çağırabildik
        printHello();

    }
    public static void  printHello(){
        System.out.println("hwello");
    }

}