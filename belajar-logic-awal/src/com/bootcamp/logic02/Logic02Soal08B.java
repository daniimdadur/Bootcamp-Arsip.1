package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal08B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[] arrayFibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                arrayFibo[i]=1;
            } else {
                arrayFibo[i]=arrayFibo[i-1]+arrayFibo[i-2];
            }
        }
        int[][] array = new int[n][n];
        int index = 0;
        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = arrayFibo[index];
            }
            if (i < nTengah){
                index++;
            } else {
                index--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && j >= nTengah){
                    System.out.print(array[i][j] + "\t");
                } else if (i + j >= n-1 && j <= nTengah) {
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
