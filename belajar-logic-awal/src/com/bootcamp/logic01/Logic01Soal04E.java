package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal04E {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();
        int value1  = 1;
        int value2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(value1 + "\t");

            int value3 =  value1 + value2;
            value1 = value2;
            value2 = value3;

        }
    }
}
