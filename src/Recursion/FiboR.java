package Recursion;

public class FiboR {

    public static void main(String[] args) {

        System.out.println(fibonachiRecursion(8));
        System.out.println(second(8));
    }

    public static int fibonachiRecursion(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Argument not suitable");
        }
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibonachiRecursion(n - 1) + fibonachiRecursion(n - 2);
        }

    }

    public static String second(int n) {

        String str = " ";

        for (int i = 1; i <= n; i++) {
            int val = fibonachiRecursion(i);
            str = str + " " + (int) val;
        }

        return str;
    }
}
