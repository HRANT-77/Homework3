package com.company;

import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    if (j != n - 1)
                        System.out.print("Black-");
                    else
                        System.out.print("Black");
                }
                else {
                    if (j != n - 1)
                        System.out.print("White-");
                    else
                        System.out.print("White");
                }
            }
            System.out.println(" ");

        }
    }
}
