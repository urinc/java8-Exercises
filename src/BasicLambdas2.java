public class BasicLambdas2 {

    public static void main(String[] args) {
        start();
    }

    static void start() {
        String s1 = "One";
        String s2 = "Ones";

        System.out.println("Longer string is: " + betterString(s1, s2, (item1, item2) -> item1.length() > item2.length()));
        System.out.println("First string is: " + betterString(s1, s2, (item1, item2) -> true));
    }

    public static String betterString(String item1, String item2, TwoStringPredicate lambda) {
        return lambda.compare(item1, item2) ? item1 : item2;
    }

}
