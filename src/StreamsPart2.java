import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsPart2 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "bye");

        String out = words.stream()
                .reduce("", (acc, element) -> acc + element.toUpperCase());
        System.out.println(out);

        String out1 = words.stream()
                .map(e -> e.toUpperCase())
                .reduce("", (acc, element) -> acc + element);
        System.out.println(out1);

        String out2 = words.stream()
                .reduce("", (acc, element) -> acc + element + ",");
        System.out.println(out2);

        System.out.println("Length of all elements is: " + out1.length());

        System.out.println(words.stream().filter(e -> e.contains("h")).count());

    }

}

