/*
	Первые три члена последовательности равны 5 , 2 и 3 соответственно.
Каждый последующий член последовательности выражается через три предыдущих 
по формуле: a_n=a_(n-3)+a_(n-2) 〖-a〗_(n-1).  Написать рекурсивный метод для
вычисления n-ого члена данной последовательности. Использовать его для написания
метода, возвращающего строку из первых n членов данной последовательности.
Протестировать метод в работе.
 */
package homework;


public class Second {

    public static void main(String[] args) {
        
        System.out.println(second(5));
        
        System.out.println(second(7));
        
    }

    public static int count(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 5;

        }
        if(n==3){
            return 3;
        }
        
        return count(n-3)+count(n-2)-count(n-1);
        
    }
    
    public static String second(int n) {
       
        String str = " ";
        
        if (n < 0) {
            throw new IllegalArgumentException("Argument not suitable");
        }
        
        for (int i = 1;i<=n;i++){
            int val = count(i);
            str = str + " " + (int)val;
        }
        
        return str;
    }
}
