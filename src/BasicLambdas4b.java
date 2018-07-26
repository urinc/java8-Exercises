import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BasicLambdas4b {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "all", "blah");
        System.out.println(transformedList(words, s -> s + "!"));
        System.out.println(transformedList(words, s -> s.replace("i", "eye")));
        System.out.println(transformedList(words, String::toUpperCase));
    }

    static List<String> transformedList(List<String> list, Function<String, String> lambda) {
        List<String> tmp = new ArrayList<>();
        list.forEach(element -> tmp.add(lambda.apply(element)));
        return tmp;
    }
}
