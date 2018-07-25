import java.util.Arrays;

public class Basic_Lambdas {

   static void start(){
        String[] arr = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven"};

        String[] arrTmp = arr.clone();

        Arrays.sort(arrTmp, (s1, s2) -> Integer.signum(s1.length() - s2.length()));
        System.out.println("Sort by length : " + Arrays.toString(arrTmp));


        arrTmp = arr.clone();
        Arrays.sort(arrTmp, (s1, s2) -> Integer.signum(s2.length() - s1.length()));
        System.out.println("Sort by length desc : " + Arrays.toString(arrTmp));

        arrTmp = arr.clone();
        Arrays.sort(arrTmp, (s1, s2) -> Integer.signum(s1.charAt(0) - s2.charAt(0)));
        System.out.println("Sort alphabetically : " + Arrays.toString(arrTmp));

        arrTmp = arr.clone();
        Arrays.sort(arrTmp, (s1, s2) -> Integer.signum(s2.indexOf('e') - s1.indexOf('e')));
        System.out.println("Sort contains 'e' : " + Arrays.toString(arrTmp));

        arrTmp = arr.clone();
        Arrays.sort(arrTmp, (s1, s2) -> helperMethod(s1, s2, 'e'));
        System.out.println("Previuos by helperMethod: " + Arrays.toString(arrTmp));



    }


    static int helperMethod(String s1, String s2, char c){
        int tmp = s2.indexOf(c) - s1.indexOf(c);
        return Integer.signum(tmp);
    }

}
