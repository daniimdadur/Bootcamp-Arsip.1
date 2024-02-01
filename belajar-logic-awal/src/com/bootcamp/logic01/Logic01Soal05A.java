package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal05A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int value1 = 1;
        int value2 = 1;
        int value3 = 1;

        for (int i = 1; i < n; i++) {
            System.out.print(value1 + " ");

            int value4 = value1 + value2 + value3;
            value1 = value2;
            value2 = value3;
            value3 = value4;

        }
    }
}
