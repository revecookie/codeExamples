package interfaces;

import java.util.Arrays;
import java.util.List;

public class Person {


    public static void main(String[] args) {
        PersonInterface<String, String> talker = (name) -> {
            String retval = "Hello " + name + "!";
            System.out.println(retval);
            return retval;
        };

        List<String> names = Arrays.asList("Lala", "Haha", "Koko");

        names.forEach(talker::talk);
    }
}
