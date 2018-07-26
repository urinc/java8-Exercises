public class BasicLambdas3 {

    public static void main(String[] args) {
        start();
    }

    static void start() {
        Car c1 = new Car("One");
        Car c2 = new Car("Ones");
        System.out.println("Longer string is: " + betterElement(c1, c2,
                (item1, item2) -> item1.length() > item2.length()));
        }

    public static <T> T betterElement(T item1, T item2, TwoElementPredicate <T> lambda) {
        return lambda.compare(item1, item2) ? item1 : item2;
    }
}
