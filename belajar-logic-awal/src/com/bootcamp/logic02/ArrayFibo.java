package com.bootcamp.logic02;

import java.util.Scanner;

public class ArrayFibo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int[] arrayFibo = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2){
                arrayFibo[i]=1;
            }else {
                arrayFibo[i]=arrayFibo[i-1]+arrayFibo[i-2];
            }
        }
        int[][] array = new int[n][n];

        int index = 0;
        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && j >= nTengah){
                    array[i][j] = arrayFibo[index];
                    System.out.print(array[i][j] + "\t");
                }if (i + j >= n-1 && j <= nTengah){
                    array[i][j] = arrayFibo[index];
                    System.out.print(array[i][j] + "\t");
                }
            }
            if (i < nTengah){
                index++;
            }else {
                index--;
            }
            System.out.println();
        }
    }
}
