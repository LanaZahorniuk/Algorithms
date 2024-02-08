package org.example.HW_3;

import java.util.Arrays;

public class Task {
    // рекурсия сумма элементов массива
    public static int getRecursion(int [] arr, int el) {
        if (el == arr.length) {
            return 0;
        } else {
            return arr[el] + getRecursion(arr,el +1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = getRecursion(arr,0);
        System.out.println(result);
    }
}

