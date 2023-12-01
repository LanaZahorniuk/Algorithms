package org.example.HW_2;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 100;
        System.out.println("------------- O(n^2) квадратичная сложность ----------------");
        test(a);
        System.out.println("--------------- O(n^2) квадратичная сложность --------------");
        test2(a);
        System.out.println("------------- O(n log n) ----------------");
        test3(b);
        System.out.println("--------------  O(log n) ---------------");
        test4(b);
    }

    public static void test(int n) { //O(n^2) квадратичная сложность
        if (n == 1)
            return;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                System.out.println("*");
    }

    public static void test2(int n) { //O(n^2) квадратичная сложность
        int a = 0;
        for (int i = 0; i < n; i++)
            for (int j = n; j > i; j--)
                a = a + i + j;
        System.out.println(a);
    }

    public static void test3(int n) { // O(n log n)
        int i, j, a = 0;
        for (i = n / 2; i <= n; i++)
            for (j = 2; j <= n; j = j * 2)
                a = a + n / 2;
        System.out.println(a);
    }

    public static void test4(int n) { // O(log n)
        int a = 0, i = n;
        while (i > 0) {
            a += i; // a = a + i
            i /= 2; // i = i / 2
            System.out.println(a);
        }
    }
}
