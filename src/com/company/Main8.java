package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            Scanner abc = new Scanner(System.in);
            a = abc.nextInt();
            sum += a;
        }
        System.out.println(sum);

    }
}
