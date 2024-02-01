package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal07B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            char huruf = (char)('A'+i);
            System.out.print(huruf + "\t");

        }
    }
}
