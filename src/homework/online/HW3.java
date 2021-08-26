package homework.online;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {

//1.
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroOne.length; i++)
            if (zeroOne[i] == 0) {
                zeroOne[i] = 1;
            } else {
                zeroOne[i] = 0;
            }
        System.out.println(Arrays.toString(zeroOne));

//2.
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (i + 1);
        System.out.println(Arrays.toString(arr1));

//3.
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++)
            if (arr2[i] < 6) {
                arr2[i] = (arr2[i] * 2);
            }
        System.out.println(Arrays.toString(arr2));

        //4.
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i][i] = 1;
            arr3[i][arr3.length - 1 - i] = 1;
            System.out.println(Arrays.toString(arr3[i]));


        }
        //5.

        System.out.println(Arrays.toString(arr4(5, 3)));


    }
    public static int[] arr4(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}