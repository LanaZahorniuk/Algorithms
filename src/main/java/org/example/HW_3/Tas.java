package org.example.HW_3;

public class Tas {
    public static int arraySum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + arraySum(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int result = arraySum(myArray, 0);
        System.out.println("Сумма элементов массива: " + result); // Вывод: Сумма элементов массива: 15
    }
}
