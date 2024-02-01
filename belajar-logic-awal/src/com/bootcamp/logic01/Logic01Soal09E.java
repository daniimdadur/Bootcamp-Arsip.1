package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal09E {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int angka = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(angka + "\t");

            int angka2 = angka*3;
            angka = angka2;
        }
    }
}
