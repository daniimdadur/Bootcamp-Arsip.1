package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal05E {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 3){
                array[i]=1;
                System.out.print(array[i] + "\t");
            }else {
                array[i] = array[i-1] + array[i-2] + array[i-3];
                System.out.print(array[i] + "\t");
            }
        }
    }
}
