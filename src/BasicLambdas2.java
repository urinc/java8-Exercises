public class Basic_Lambdas_2<T> {

    static void start() {
        String s1 = "One";
        String s2 = "Ones";

        Basic_Lambdas_2 bl1 = new Basic_Lambdas_2();

        System.out.println("Longer string is: " + bl1.betterString(s1, s2, bl1.longerLambda));
        System.out.println("First string  is: " + bl1.betterString(s1, s2, bl1.firstStringLambda));

        Car car1 = new Car("car");
        Car car2 = new Car("carrr");

        System.out.println("Longer car is: " + bl1.betterString(car1, car2, bl1.longerCarLambda));
        System.out.println("First car  is: " + bl1.betterString(s1, s2, bl1.firstStringLambda));
    }

    Compare <String> longerLambda = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

    Compare<String> firstStringLambda = (s1, s2) -> s1;

    Compare <Car> longerCarLambda = (c1, c2)-> c1.length() > c2.length() ? c1: c2;
    Compare <Car> firstCarLambda = (c1, c2) -> c1;

    T betterString(T s1, T s2, Compare lambda) {

        return (T) lambda.apply(s1, s2);
    }


}
