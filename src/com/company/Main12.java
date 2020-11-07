package com.company;

import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " ");
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
