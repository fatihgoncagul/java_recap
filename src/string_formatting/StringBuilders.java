package string_formatting;
/*
*
* since string is immutable, each method call new instance of an string
* java provides a mutable class that lets us change its text value
* which is StringBuilder class.
*
* strinmg methods create a new object in memory, and return a reference to this new object
* stringbuilder methods return a stringbuilder reference, but its really a self reference
*
*
*
* */
public class StringBuilders {

    public static void main(String[] args) {

        String str = "hello"+" world";
        str.concat(" and goodbye");
        // DOES NOT COMPİLEStringBuilder builder = "hello"+"world";
        StringBuilder helloBuilder = new StringBuilder("hello"+"world");
        helloBuilder.append(" and goodbye");
        //str.concat will produce new instance of a strşing but str variable does not change we need to assign
        //on the other hand strbuilder object when appended it does change
        System.out.println(str);
        System.out.println(helloBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInfo(emptyStart);
        printInfo(emptyStart32);
        emptyStart.append("a".repeat(57));
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);
        //some methods of strbuilders: delete, deletecharat, insert, reverse,setlength for trucate
        StringBuilder builder = new StringBuilder("hello"+" world");
        builder.append(" and goodbye");

        builder.deleteCharAt(16).insert(16,'X');
        System.out.println(builder);
        builder.replace(16,17,"G");
        System.out.println(builder);

        builder.reverse().setLength(7);
        System.out.println(builder);


    }
    public static void  printInfo(String string){
        System.out.println("String: "+string);
        System.out.println("length: "+string.length());

    }
    public static void  printInfo(StringBuilder builder){
        System.out.println("String: "+builder);
        System.out.println("length: "+builder.length());
        System.out.println("capacity: " + builder.capacity());

    }

}
