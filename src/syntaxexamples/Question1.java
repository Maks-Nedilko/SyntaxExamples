package syntaxexamples;

import java.util.Arrays;

public class Question1 {

    public static String[] met(String[] mas) {

        for (int i = 0; i < mas.length; i++) {
            if (mas.length < 3) {

            } else {
                mas[i] = mas[i].substring(0, 2);
            }

        }
        return mas;
    }

    public static void main(String[] args) {
        String[] s = {"aa", "bb", "cc", "dd"};
        System.out.println(Arrays.toString(met(s)));
    }

}
