package oop_polymorphism;

/*
* it means many forms
* it lets us write code to call a method but a runtime this
* methods behaviour  can be different
* this means the behaviour that occurs, while the program is executing,
* depends on the runtime type of the object
* the declared type has to have some kind of relationship to the runtime type
* and inheritance is one way to establish this relationship
* there are other ways but we are gonna use inheritance to support polymorphism
*
*
*
* */

import java.util.Scanner;

public class Polymorphism {

    public static void main(String[] args) {
/*        Movie theMovie = new Movie("Star wars");

        theMovie.watchMovie();
        Movie anotherMovie = new Comedy("Star wars");

        anotherMovie.watchMovie();

        Movie movie = Movie.getMovie("Adventure","Star wars");
        movie.watchMovie();*/

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.printf("enter type (A for adventure C for comedy S for Science" +
                    "Fiction, or  Q to quit)");

            String type = scanner.nextLine();

            if ("Qq".contains(type)){
                break;
            }
            System.out.println("enter movie title: ");

            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
            //eğer documantery typeı eklemek istersek
            //factory methodunu değiştirmemiz orda documentary classına yönlendirmemiz yeterli
            //polymorphism bunu sağlıyor
            // parent class diğer sınıflar hakkında bi şşey bilmiyor
            /*
            *
            * its ability to execute different behaviour, for different types, which are determined
            * at runtime
            * and yet we did it with just two statements
            * polymorphjism enables you to write generic code, based on the parent class
            *
            *
            * */




        }






    }

}
