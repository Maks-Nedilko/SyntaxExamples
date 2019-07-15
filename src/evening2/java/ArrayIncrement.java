package evening2.java;

import java.util.Arrays;

public class ArrayIncrement {

    

    static int[] incrArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4};
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("Array increment : " + Arrays.toString(incrArray(array)));

    }

}
