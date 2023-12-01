package org.example.HW_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int sum = 0;
        sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}
