/*
 
	Написать  метод, получающий на вход квадратную матрицу и возвращающий
новую матрицу, где чётные строки отсортированы  по возрастанию, а нечётные
по убыванию.

 */
package homework;

import java.util.Arrays;


public class ExSeventh {
    
    public static void sort(int[][] matrix){

        int temp;
        boolean even;

        for (int k = 0; k < matrix.length; k++){
            even = k % 2 == 0;
            for (int j = 1; j < matrix.length; j++) {
                for (int i = 0; i < matrix.length - j; i++) {
                    if ((even && matrix[k][i] < matrix[k][i + 1]) || (!even && matrix[k][i] > matrix[k][i + 1])) {
                        temp = matrix[k][i + 1];
                        matrix[k][i + 1] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        int[][] matrix = {
                {16, 3, 2, 13, 1},
                {5, 10, 11, 8, 6},
                {9, 6, 7, 11, 8},
                {4, 15, 14, 1, 9},
                {100, 98, 99, 105, 5}
        };
        System.out.println(Arrays.deepToString(matrix));
        sort(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    
}
