import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExpressionsPart4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye", "heroku", "hue", "ehu");

        System.out.println(firstAllMatch(words.stream()
                , item -> item.contains("h")
                , item -> item.contains("u")
                , item -> item.contains("o")
                , item -> item.length() > 5
        ));
        System.out.println(firstAnyMatch(words.stream()
                , item -> item.contains("z")
                , item -> item.contains("u")
                , item -> item.contains("o")
                , item -> item.length() > 5
        ));
    }

    @SafeVarargs
    static Predicate<String> allPassPredicate(Predicate<String>... lambdas) {
        Predicate<String> tmp = item -> true;
        for (Predicate<String> lambda : lambdas) {
            tmp = tmp.and(lambda);
        }
        return tmp;
    }

    @SafeVarargs
    static String firstAllMatch(Stream<String> stream, Predicate<String>... lambdas) {
        return stream.filter(allPassPredicate(lambdas)).findFirst().orElse(null);
    }

    @SafeVarargs
    static Predicate<String> anyPassPredicate(Predicate<String>... lambdas) {
        Predicate<String> tmp = item -> true;
        for (Predicate<String> lambda : lambdas) {
            tmp = tmp.or(lambda);
        }
        return tmp;
    }

    @SafeVarargs
    static String firstAnyMatch(Stream<String> stream, Predicate<String>... lambdas) {
        return stream.filter(anyPassPredicate(lambdas)).findFirst().orElse(null);
    }
}
