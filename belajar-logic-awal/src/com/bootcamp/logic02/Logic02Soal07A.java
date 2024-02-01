package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal07A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N:");
        int n = input.nextInt();

        int[] arrayFibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                arrayFibo[i]=1;
            } else {
                arrayFibo[i]=arrayFibo[i-1]+arrayFibo[i-2];
            }
        }
        int[][] array = new int[n][n];


    }
}
