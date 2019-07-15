package evening2.java;

public class Pifagor {

    static double hypotenuse(double a, double b) {

        return Math.sqrt(a * a + b * b);

    }

    static int factorial(int n) {
        int result = 1;

        if (n < 0) {
            throw new IllegalArgumentException("Argument must non-negative");

        }
        if (n == 0) {
            return 0;
        }

        for (int i = 1; i <= n; i = i++) {
            result = result * i;
        }

        return result;

    }

    public static void main(String[] args) {
//        double a =4;
//        double b =3;
//
//        System.out.println("hypotenuse" + hypotenuse(a,b));
        
        System.out.println(factorial(4));
    }

}
