package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal06B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[] arrayFibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                arrayFibo[i]=1;
            }else {
                arrayFibo[i]=arrayFibo[i-1]+arrayFibo[i-2];
            }
        }
        int[][] array = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    array[i][j] = arrayFibo[index];
            }
            index++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i <= j){
                    System.out.print(array[i][j] + "\t");
                } else if (i + j >= n-1 && i >= j) {
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
