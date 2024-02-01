package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal04A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int value1 = 1;
            int value2 = 1;
            for (int j = 0; j < n; j++) {
                array[i][j] = value1;
                if (i == 0||j == 0||i == 8||j == 8||i == 4||j == 4){
                    System.out.print(value1 + "\t");
                }else {
                    System.out.print("\t");
                }
                int value3 = value1 + value2;
                value1 = value2;
                value2 = value3;
            }
            System.out.println();
        }
    }
}
