package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal03A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");

        int n = input.nextInt();

        for (int i = 0; i <= n *2-2; i+=2) {
            System.out.print(i + "\t");

        }
    }
}
