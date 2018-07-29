import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPart1a {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye");
            words.stream()
                .map(e -> {
                    e = e.toUpperCase();
                    System.out.println("Uppercase: " + e);
                    return e;
                })
                .filter(e -> {
                    System.out.println("Checking length: " + e);
                    return e.length()<4;
                })
                .filter(e->{
                    System.out.println("Checking containing 'e':" + e);
                    return e.contains("e");
                })
                .findFirst()
                .orElse("");
    }
}
