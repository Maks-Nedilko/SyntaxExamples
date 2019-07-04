/*
	Концепция OVERLOAD. В одном классе создать статические методы  double[]
sort(double[] ar) и long[]  sort(long[] ar) для сортировки по убыванию массивов
соответствующих чисел. Протестировать работу методов. Убедиться в возможности
безобидного сосуществования под крышей одного класса методов с одинаковым именем
, похожим функционалом, но с разной сигнатурой.
 */
package homework;

import java.util.Arrays;

public class Third {

    public static void main(String[] args) {
        
       double[] arraydouble = {1.1, 1.2, 2.2,2.1,};
        System.out.println("Array double : " + Arrays.toString(arraydouble));
        System.out.println("Sort double array : " + Arrays.toString(sort(arraydouble)));
       
//       for (double s:arraydouble){
//           System.out.println(s);
//       }
       
       long [] arraylong = {12345, 12354, 23415, 52221,};
       
        System.out.println("Array long : " + Arrays.toString(arraylong));
        System.out.println("Sort long array : " + Arrays.toString(sort(arraylong)));
        
//       for (long s:arraylong){
//           System.out.println(s);
//       }
    }
    
    public static double[] sort(double[] array){
        
        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                   double temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static long [] sort(long [] array){
       
        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                    
                   long temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    
}
