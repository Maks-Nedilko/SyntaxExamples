package evening2.java;

public class AreaCircle {

    public static final double PI = 3.1415;

    static double lenght(double radius) {

        return 2 * PI * radius;
    }

    static double area(double radius) {

        return PI * radius * radius;
    }

    public static void main(String[] args) {

        double radius = 5;

        System.out.println("Leght cirle = " + lenght(radius));
        System.out.println("Area = " + area(radius));
    }

}
