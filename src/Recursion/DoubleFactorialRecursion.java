
package Recursion;


public class DoubleFactorialRecursion {
    
    public static void main(String[] args) {
        System.out.println("5!! = " + factorial(5));
        
    }
    
    public static long factorial(int n){
        
        if (n<0){
            throw new IllegalArgumentException("Argument not suitable");
        }
        if(n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-2);
        }
    
}
}
