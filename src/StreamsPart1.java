import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StreamsPart1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye");

        words.stream().forEach(word -> System.out.println("  " + word));
        words.stream().forEach(System.out::println);
        System.out.println(transformedList(words, s -> s + "!"));
        System.out.println(transformedList(words, s -> s.replace("i", "eye")));
        System.out.println(transformedList(words, String::toUpperCase));
        System.out.println(allMatches(words, s -> s.length() < 4));
        System.out.println(allMatches(words, s -> s.contains("b")));
        System.out.println(allMatches(words, s -> (s.length() % 2) == 0));

        List<String> wordsUpperLenL4 = words.stream()
                .map(String::toUpperCase)
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        String wordsWithE = wordsUpperLenL4.stream()
                .filter(e -> e.contains("e"))
                .findFirst()
                .orElse("");

        String wordsWithQ = wordsUpperLenL4.stream()
                .filter(e -> e.contains("q"))
                .findFirst()
                .orElse("");
    }
    static List<String> transformedList(List<String> words, UnaryOperator<String> lambda) {
        return words.stream().map(lambda).collect(Collectors.toList());
    }
    static List<String> allMatches(List<String> words, Predicate<String> lambda) {
        return words.stream().filter(lambda).collect(Collectors.toList());
    }
}
