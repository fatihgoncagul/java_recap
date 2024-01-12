package oop_polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");

    }
    //factory methods: calling code in main does not need no know all of the subclasses
    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);

            default -> new Movie(title);
        };

    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasent Scene", "Scary Music", "Something bad happens");

    }
    public void watchAdventure(){
        System.out.println("watching adventure");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny happens", "Got funnier!!", "hahhaha");

    }
    public void watchComedy(){
        System.out.println("watching comedy");
    }
}


class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "yes its a space movie", "not interstaller maan", "space oddyses");

    }

    public void watchScienceFiction(){
        System.out.println("watching Science fiction");
    }
}
