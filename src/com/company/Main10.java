package com.company;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated): ");
        int a= scanner.nextInt();
        for(int i=1; i<11; i++)
            System.out.println(a+" X "+i+" = "+a*i);
    }
}
