package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                array[i][j] = angka;
                if (i + j >= 4 && j - i <= 4 && i <= 4){
                    System.out.print(angka + "\t");
                }else if (i - j <= 4 && i + j <= 12 && i >= 4) {
                    System.out.print(angka + "\t");
                }  else {
                    System.out.print("\t");
                }
                angka++;
            }
            System.out.println();
        }
    }
}
