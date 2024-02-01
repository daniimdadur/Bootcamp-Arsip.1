package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal06B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int angka = 2;
        int bilanganPrimaDitemukan = 0;

        while (bilanganPrimaDitemukan < n){
            if (isiBilangaPrima(angka)){
                System.out.print(angka + "\t");
                bilanganPrimaDitemukan++;
            }angka++;
        }
    }
    public static boolean isiBilangaPrima(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }return true;
    }
}
