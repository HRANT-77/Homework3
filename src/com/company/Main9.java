package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + i * i * i);

        }

    }
}
