package Recursion;

public class TestValuesDefault {

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        long[] arr2 = new long[3];
        double[] arr3 = new double[3];
        boolean[] arr4 = new boolean[3];
        String[] arr5 = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
            System.out.println(arr3[i]);
            System.out.println(arr4[i]);
            System.out.println(arr5[i]);
        }
        for (int a : arr1) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (double a : arr3) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (boolean a : arr4) {
            System.out.print(a + " ");
        }

    }

}
