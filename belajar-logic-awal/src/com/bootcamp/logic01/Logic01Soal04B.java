package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal04B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int angkaPertama = 1;
        int angkaKedua = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(angkaPertama + " ");

            int angkaKetiga = angkaPertama + angkaKedua;
            angkaPertama = angkaKedua;
            angkaKedua = angkaKetiga;





        }
    }
}
