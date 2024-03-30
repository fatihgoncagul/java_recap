package optional_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("navin", "laxmi", "john", "kishor");

        Optional<String> name = names.stream().filter(str -> str.contains("x"))
                .findFirst();
        System.out.println(name.orElse("not found"));

        String name2 = names.stream().filter(str -> str.contains("x"))
                .findFirst().orElse("null");
        System.out.println(name2);

    }

}
