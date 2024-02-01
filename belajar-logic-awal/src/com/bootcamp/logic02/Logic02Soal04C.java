package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal04C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < 2) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i][j-1] + array[i][j-2];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==8||j==8||i==4||j==4){
                    System.out.print(array[i][j] + "\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
