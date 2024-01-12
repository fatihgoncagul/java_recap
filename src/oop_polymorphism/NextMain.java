package oop_polymorphism;

public class NextMain {


    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();


        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy =  Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();


        var airplane  = Movie.getMovie("C","airplane");
        airplane.watchMovie();
        //java figures out compile time type for us
        //it cant be used in fields of classes
        // it cant be used method signatures, parameter or as return type
        // it cant be used without assşignment
        //it cant be assigned null

        var plane = new  Comedy("airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("A","JAW");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
