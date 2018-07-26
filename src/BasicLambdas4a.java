import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicLambdas4a {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "all", "blah");
        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);

        System.out.println(allMatches(nums, n -> n > 500));
        System.out.println(allMatches(words, s -> s.contains("b")));
    }

    static <T> List<T> allMatches(List<T> list, ListAnyPredicate<T> lambda) {
        List<T> tmp = new ArrayList<>();
        list.forEach(el -> {
            if (lambda.match(el)) {
                tmp.add(el);
            }
        });
        return tmp;
    }
}
