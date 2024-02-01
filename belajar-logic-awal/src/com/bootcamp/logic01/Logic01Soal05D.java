package com.bootcamp.logic01;
import java.util.Scanner;

public class Logic01Soal05D {
    

    public class BilanganPrima {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nilai N: ");
            int n = scanner.nextInt();

            System.out.println("Bilangan prima dari 2 hingga " + n + " adalah:");
            for (int i = 2; i <= n; i++) {
                if (isPrima(i)) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }

        // Method untuk mengecek apakah suatu bilangan adalah bilangan prima atau bukan
        private static boolean isPrima(int angka) {
            if (angka <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }




}


