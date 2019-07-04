
package Recursion;


public class FactorialRecursion {
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
    public static long factorial(int n){
        
        if (n<0){
            throw new IllegalArgumentException("Argument not suitable");
        }
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
        
    }

}
