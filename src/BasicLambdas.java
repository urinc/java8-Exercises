import java.util.Arrays;

public class BasicLambdas {

    public static void main(String[] args) {
    start();
    }


    static void start() {
        String[] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};

        Arrays.sort(arr, (s1, s2) -> (s1.length() - s2.length()));
        System.out.println("Sort by length : " + Arrays.toString(arr));

        Arrays.sort(arr, (s1, s2) -> s2.length() - s1.length());
        System.out.println("Sort by length desc : " + Arrays.toString(arr));

        Arrays.sort(arr, (s1, s2) -> (s1.charAt(0) - s2.charAt(0)));
        System.out.println("Sort alphabetically : " + Arrays.toString(arr));

        Arrays.sort(arr, (s1, s2) -> (s2.indexOf('e') - s1.indexOf('e')));
        System.out.println("Sort contains 'e' : " + Arrays.toString(arr));

        Arrays.sort(arr, BasicLambdas::getIndexContainingE);
        System.out.println("Previuos by helperMethod: " + Arrays.toString(arr));
        }


    static int getIndexContainingE(String item1, String item2) {
        return item2.indexOf('e') - item1.indexOf('e');
    }

}
