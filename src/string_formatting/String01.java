package string_formatting;

public class String01 {

    public static void main(String[] args) {
        printInformation("hello stranger");
        printInformation("");
        printInformation("\t    \n");
        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n",helloworld.indexOf('r'));
        System.out.printf("index of r = %d %n",helloworld.indexOf("World"));
        System.out.printf("index of l = %d %n",helloworld.indexOf('l'));
        System.out.printf("index of l = %d %n",helloworld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n",helloworld.indexOf('l',3));
        System.out.printf("index of l = %d %n",helloworld.lastIndexOf('l',6));

        // equals contains
        //endswith startswith

        String helloworldlower = helloworld.toLowerCase();
        if (helloworld.equals(helloworldlower)){
            System.out.printf("values match exatcly");
        }
        if (helloworld.equalsIgnoreCase(helloworldlower)){
            System.out.println("values match ignoring case");
        }
        if ( helloworldlower.startsWith("hello")){
            System.out.println("str starts with hello");
        }if (helloworldlower.endsWith("d")){
            System.out.println("str ends with d");
        }


    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("str is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("string is blank");
        }
        System.out.printf("first char = %c %n", string.charAt(0));

        System.out.printf("last char = %c %n",string.charAt(length-1));


    }

}
