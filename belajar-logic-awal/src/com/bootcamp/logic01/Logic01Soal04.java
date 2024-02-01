package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int angkaSebelumnya = 1;
        int angkaSekarang = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(angkaSebelumnya + "\t");

            int angkaSelanjutnya = angkaSebelumnya + angkaSekarang;
            angkaSebelumnya = angkaSekarang;
            angkaSekarang = angkaSelanjutnya;

        }
    }
}
