package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal08E {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        char huruf = 'A';

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                System.out.print(huruf + "\t");
                huruf+=2;
            }else{
                System.out.print(i + "\t");
            }
        }
    }
}
