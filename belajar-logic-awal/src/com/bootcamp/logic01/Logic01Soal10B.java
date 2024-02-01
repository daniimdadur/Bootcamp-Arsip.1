package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal10B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int pangkat = (int) Math.pow(i,3);
            System.out.print(pangkat + "\t");
        }
    }
}
