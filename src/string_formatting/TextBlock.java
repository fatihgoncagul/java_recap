package string_formatting;


/*
*
* whats a text block?
* a text block is just a special format for multi line string literals
* its simply a string with a new representation in the source code
*
* */
public class TextBlock {

    public static void main(String[] args) {


        String bulletIt = "Print a bulleted list\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        String textBlock = """
                Print a bulleted list:
                \u2022 First Point
                    \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("your age is %d%n",age);

        int yearOfBirth = 2023-age;
        System.out.printf("age = %d, birth year = %d%n",age,yearOfBirth);
        System.out.printf("age = %d, birth year = %.2f%n",age,(float)yearOfBirth);


        //string formatting , left side aligned
        for (int i = 1; i  < 100000; i*=10) {
            System.out.printf("printing %d %n",i);
        }
        //string formatting , right side aligned
        for (int i = 1; i  < 100000; i*=10) {
            System.out.printf("printing %6d %n",i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);




    }

}
