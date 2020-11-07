package com.company;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        int q = 0;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            b = a % i;
            if (b == 0) {
                q += 1;
            }
        }
        if (q == 2)
            System.out.println(a + " is a prime number");
        else
            System.out.println(a + " have " + q + " divider");
    }
}
