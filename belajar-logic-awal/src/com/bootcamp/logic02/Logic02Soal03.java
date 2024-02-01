package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int [][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == 8 || j == 8 || i == j || i + j == 8){
                    array [i][j] = angka;
                    System.out.print(angka + "\t");
                }
                else{
                    System.out.print("\t");
                }
            angka +=2;
            }
            System.out.println();
        }

    }
}

