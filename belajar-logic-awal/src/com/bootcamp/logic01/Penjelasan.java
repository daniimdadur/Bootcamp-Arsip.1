package com.bootcamp.logic01;

public class Penjelasan {
    public static void main(String[] args) {
        int n = 23;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " bukan bilangan prima.");
                return;
            }
        }

        System.out.println(n + " adalah bilangan prima.");

    }
}
