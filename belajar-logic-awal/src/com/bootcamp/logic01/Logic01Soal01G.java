package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal01G {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");

        }
    }
}
