import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicLambdas4 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "all", "blah");


        System.out.println(allMatches(words, s -> s.length() < 4));
        System.out.println(allMatches(words, s -> s.contains("b")));
        System.out.println(allMatches(words, s -> (s.length() % 2) == 0));

    }


    static List<String> allMatches (List<String> list, ListPredicate lambda) {
        List<String> tmp = new ArrayList<>();
        list.forEach(el -> {
            if (lambda.match(el)) {
                tmp.add(el);
            }
        });
             return tmp;

    }
}
