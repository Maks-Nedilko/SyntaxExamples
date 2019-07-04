package homework;

/*
	Написать метод, получающий на входе одномерный массив int[] и 
возвращающий массив таких одномерных массивов: в первом массиве все элементы
массива-аргумента, во втором со второго по последний, в третьем с третьего
по последний и т.д. 

*/

import java.util.Arrays;

public class ExNineth {
    
     public static int[][] getMatrix(int[] array){
        int[][] matrix = new int[array.length][];
        for (int i = 0; i < array.length; i++){
            matrix[i] = new int[array.length - i];
           
            for (int j = i; j < array.length; j++){
             
                matrix[i][j - i] = array[j];
                
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] array = {3,4,5, 6, 7, 8, 9, 10};
        for(int[] a : getMatrix(array)){
            System.out.println( Arrays.toString(a) + "");
       }
       
        
    }

    
}
