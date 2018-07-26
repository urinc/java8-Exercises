import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BasicLambdas4c {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "all", "blah");
        System.out.println(transformedList(words, String::length));
    }

    static <T> List<T> transformedList(List<String> list, Function<String, T> lambda) {
        List<T> tmp = new ArrayList<>();
        list.forEach(element -> tmp.add(lambda.apply(element)));
        return tmp;
    }
}
