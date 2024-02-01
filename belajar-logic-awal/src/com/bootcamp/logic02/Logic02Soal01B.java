package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal01B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                array[i][j] = angka;
                if (i == j||i + j == 8){
                    System.out.print(angka + "\t");
                }else {
                    System.out.print("\t");
                }
                angka++;
            }
            System.out.println();
        }
    }
}
