package string_formatting;
/*
* indent : adds or removes spaces from beginning of lines
* strip: takes out white spaces for larger set
* trim: takes out white spaces
* concat: similar to plus operator
* repeat:
* join:
* replace
* replaceAll
* replaceFirst
* substring
* subSequence
*
* */
public class StringMethods {

    public static void main(String[] args) {
        String birthdate = "25/11/1985";
        int startingIndex = birthdate.indexOf("1985");
        System.out.println("starting index: "+ startingIndex);
        System.out.println("birth year: "+birthdate.substring(startingIndex));
        System.out.println("month: "+birthdate.substring(3,5));
        String newDate = String.join("/","25","11","1985");
        System.out.println("new date: "+ newDate);
        newDate = "25";
        newDate.concat("/11/1985");
        newDate = "25"+"/"+"11"+"/"+"1985";
        newDate = "25".concat("/11/1985");
        System.out.println("newdate: "+newDate);

        System.out.println(newDate.replaceAll("/","-"));
        System.out.println(newDate.replaceFirst("/",","));
        System.out.println(newDate.replace("1","0"));
        System.out.println(newDate.replace('/','-'));

        System.out.println("ABC\n".repeat(3));
        System.out.println("ABC\n".repeat(3).indent(5));

        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2));

    }

}
