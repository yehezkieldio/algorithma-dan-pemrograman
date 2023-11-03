package com.elizielx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kodeBarang = "";

        System.out.println("Pilih barang: A. Jeans, B. Lea, C. Levis.");

        while (!kodeBarang.matches("[a-cA-C]")) {
            kodeBarang = scanner.next().toLowerCase();

            if (!kodeBarang.matches("[a-cA-C]")) {
                System.out.println("Input tidak valid. Silakan masukkan A, B, atau C.");
            }
        }
        System.out.println("Kode barang yang dipilih: " + kodeBarang);
        scanner.close();
    }
}