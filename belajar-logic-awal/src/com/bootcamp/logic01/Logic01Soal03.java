package com.bootcamp.logic01;

import java.util.Scanner;

public class Logic01Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukin Nilai N: ");

        int n = input.nextInt();

        for (int i = 0; i <= n *2-2; i++) {
            if (i % 2 == 0){
                System.out.print(i + "\t");
            }
        }
    }
}
