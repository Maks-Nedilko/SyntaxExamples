/*
 	Первые два члена последовательности равны 2 и -7 соответственно. 
Каждый последующий член последовательности выражается через два предыдущих 
по формуле: a_n=2〖*a〗_(n-1)+〖(-1)〗^n*3*a_(n-2).  Написать рекурсивный метод
для вычисления n-ого члена данной последовательности. Использовать его для
написания метода, возвращающего строку из первых n членов данной последовательности. 
Протестировать метод в работе.
 */
package homework;

public class First {

    public static void main(String[] args) {

        System.out.println(second(5));

    }

    public static int first(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Argument not suitable");

        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return -7;
        } else {

            return (int) ((2 * first(n - 1)) + Math.pow(-1, (n * 3 * first(n - 2))));

        }
    }

    public static String second(int n) {

        String str = " ";

        for (int i = 1; i <= n; i++) {
            int val = first(i);
            str = str + " " + (int) val;
        }

        return str;
    }


}
