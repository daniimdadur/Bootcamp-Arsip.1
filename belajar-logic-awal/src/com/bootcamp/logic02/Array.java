package com.bootcamp.logic02;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int [][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            //print kesamping
            int angka = 1;
            for (int j = 0; j < n; j++) {
                array[i][j] = angka;
                System.out.print(angka + "\t");
                angka++;
            }
            //pindah baris
            System.out.println();
        }
    }
}
