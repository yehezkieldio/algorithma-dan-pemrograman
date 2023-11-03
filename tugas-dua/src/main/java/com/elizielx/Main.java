package com.elizielx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodeBarang = "";
        String namaBarang = "";
        int quantity = 0;
        double hargaBarang = 0.0;
        double totalHarga = 0.0;
        double besaranDiskon = 0.0;
        double diskon = totalHarga * besaranDiskon;
        double jumlahBayar = totalHarga - diskon;

        System.out.println(
                "A. Jeans. Rp 200,000.00\nB. Lea. Rp 300,000.00\nC. Levis. Rp 500,000.00\nPilih kode barang yang dibeli:");
        while (!kodeBarang.matches("[a-cA-C]")) {
            kodeBarang = scanner.next().toLowerCase();

            if (!kodeBarang.matches("[a-cA-C]")) {
                System.out.println("Input tidak valid. Silakan masukkan A, B, atau C.");
            }
        }

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        while (quantity <= 0) {
            quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Input tidak valid. Silakan masukkan angka yang lebih besar dari 0.");
            }
        }

        scanner.close();

        switch (kodeBarang) {
            case "a":
                namaBarang = "Jeans";
                hargaBarang = 200000.0;
                totalHarga = quantity * 200000.0;
                break;
            case "b":
                namaBarang = "Lea";
                hargaBarang = 300000.0;
                totalHarga = quantity * 300000.0;
                break;
            case "c":
                namaBarang = "Levis";
                hargaBarang = 500000.0;
                totalHarga = quantity * 500000.0;
            default:
                break;
        }

        if (totalHarga > 1000000.0) {
            besaranDiskon = 0.1;
        } else if (totalHarga > 500000.0 && totalHarga <= 1000000.0) {
            besaranDiskon = 0.05;
        } else {
            besaranDiskon = 0.0;
        }

        diskon = totalHarga * besaranDiskon;
        jumlahBayar = totalHarga - diskon;

        System.out.println("Nama barang yang dibeli: " + namaBarang);
        System.out.println("Jumlah barang yang dibeli: " + quantity);
        System.out.println("Jumlah harga barang: Rp " + String.format("%,.2f", hargaBarang));
        System.out.println("Jumlah total harga: Rp " + String.format("%,.2f", totalHarga));
        System.out.println("Besaran diskon: " + String.format("%.0f", besaranDiskon * 100) + "%");
        System.out.println("Jumlah diskon: Rp " + String.format("%,.2f", diskon));
        System.out.println("Jumlah yang harus dibayar: Rp " + String.format("%,.2f", jumlahBayar));
    }
}