package org.example.HW_4;

public class Lesson {
    public static void main(String[] args) {
        int[] arr = {40, 250, 80, 88, 240, 12, 148};
        getMaxNumber(arr);
        getMinNumber(arr);
    }

    static public int getMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max);
            }
        }
        return max;
    }

    static public int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println(min);
            }
        }
        return min;
    }
}


/*
public static void main(String[] args) {
   int arr[] = {70, 250, 50, 300, 1};
   System.out.println(getMaxElement(arr, 0));
   System.out.println(getMinElement(arr, 0));
}
static int getMaxElement(int arr[], int index)
{
   int max;
   int length = arr.length;
   if (length > index)
   {
       max = getMaxElement(arr, index + 1);
       if (arr[index] > max)
           return arr[index];
       else
           return max;
   } else {
       return arr[index - 1];
   }
}

static int getMinElement(int arr[], int index)
{
   int min;
   int length = arr.length;
   if (length > index)
   {
       min = getMinElement(arr, index + 1);
       if (arr[index] < min)
           return arr[index];
       else
           return min;
   } else {
       return arr[index - 1];
   }
}
 */