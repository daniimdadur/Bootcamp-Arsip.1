package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal05D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < 3){
                    array[i][j] = 1;
                }else {
                    array[i][j]=array[i][j-1]+array[i][j-2]+array[i][j-3];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n-1 && i <= j){
                    System.out.print(array[i][j] + "\t");
                } else if (i + j <= n-1 && i >= j) {
                    System.out.print(array[i][j] + "\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
