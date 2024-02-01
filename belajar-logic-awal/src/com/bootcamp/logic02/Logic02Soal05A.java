package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal05A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int [][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int value1 = 1;
            int value2 = 1;
            int value3 = 1;
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i >= j){
                    array [i][j] = value1;
                    System.out.print(value1 + "\t");
                } else if (i + j >= n-1 && i <= j) {
                    System.out.print(value1 + "\t");
                } else {
                    System.out.print("\t");
                }
                int value4 = value1 + value2 + value3;
                value1 = value2;
                value2 = value3;
                value3 = value4;
            }
            System.out.println();
        }
    }
}