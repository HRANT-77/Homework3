package com.company;

public class Main2 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
