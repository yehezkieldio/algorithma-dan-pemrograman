package com.elizielx;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Scan atau membaca input dari user.
    Scanner scanner = new Scanner(System.in);

    // Deklarasi variabel.
    String kodeBarang = "";
    String namaBarang = "";
    int jumlahBarang = 0;
    double hargaBarang = 0.0;
    double totalHarga = 0.0;
    double besaranDiskon = 0.0;
    double diskon = totalHarga * besaranDiskon;
    double jumlahBayar = totalHarga - diskon;

    // Tampilkan pesan menu kode barang yang akan dibeli.
    System.out.println(
        "A. Jeans. Rp 200,000.00\n"
            + "B. Lea. Rp 300,000.00\n"
            + "C. Levis. Rp 500,000.00\n"
            + "Pilih kode barang yang dibeli:");

    // Validasi input kode barang.
    // Hanya menerima input A, B, atau C.
    while (!kodeBarang.matches("[a-cA-C]")) {
      // Baca input kode barang dari user dan ubah menjadi huruf kecil.
      kodeBarang = scanner.next().toLowerCase();

      // Jika input kode barang tidak valid, tampilkan pesan error.
      if (!kodeBarang.matches("[a-cA-C]")) {
        // Tampilkan pesan error.
        System.out.println("Input tidak valid. Silakan masukkan A, B, atau C.");
      }
    }

    // Tampilkan pesan input jumlah barang yang dibeli.
    System.out.println("Masukkan jumlah barang yang dibeli: ");

    // Validasi input jumlah barang.
    // Hanya menerima input angka yang lebih besar dari 0.
    while (jumlahBarang <= 0) {
      // Baca input jumlah barang dari user.
      jumlahBarang = scanner.nextInt();

      // Jika input jumlah barang tidak valid, tampilkan pesan error.
      if (jumlahBarang <= 0) {
        // Tampilkan pesan error.
        System.out.println("Input tidak valid. Silakan masukkan angka yang lebih besar dari 0.");
      }
    }

    // Tutup scanner agar tidak terjadi memory leak.
    scanner.close();

    // Hitung total harga barang.
    // Gunakan switch case untuk menentukan harga barang berdasarkan kode barang.
    switch (kodeBarang) {
        // Jika kode barang adalah a,
        // maka nama barang adalah Jeans dan harga barang adalah 200000.0.
      case "a":
        namaBarang = "Jeans";
        hargaBarang = 200000.0;

        // Jumlah total harga adalah jumlah barang dikali harga barang.
        totalHarga = jumlahBarang * 200000.0;
        break;

        // Jika kode barang adalah b,
        // maka nama barang adalah Lea dan harga barang adalah 300000.0.
      case "b":
        namaBarang = "Lea";
        hargaBarang = 300000.0;

        // Jumlah total harga adalah jumlah barang dikali harga barang.
        totalHarga = jumlahBarang * 300000.0;
        break;

        // Jika kode barang adalah c,
        // maka nama barang adalah Levis dan harga barang adalah 500000.0.
      case "c":
        namaBarang = "Levis";
        hargaBarang = 500000.0;

        // Jumlah total harga adalah jumlah barang dikali harga barang.
        totalHarga = jumlahBarang * 500000.0;

        // Jika kode barang tidak valid, maka total harga adalah 0.0.
      default:
        break;
    }

    // Jika total harga lebih besar dari 1000000.0,
    // maka besaran diskon adalah 0.1 atau 10%.
    if (totalHarga > 1000000.0) {
      besaranDiskon = 0.1;

      // Jika total harga lebih besar dari 500000.0
      // dan kurang dari atau sama dengan 1000000.0,
      // maka besaran diskon adalah 0.05 atau 5%.
    } else if (totalHarga > 500000.0 && totalHarga <= 1000000.0) {
      besaranDiskon = 0.05;

      // Jika total harga kurang dari atau sama dengan 500000.0,
      // maka besaran diskon adalah 0.0 atau 0%.
    } else {
      besaranDiskon = 0.0;
    }

    // Jumlah diskon adalah total harga dikali besaran diskon.
    diskon = totalHarga * besaranDiskon;

    // Jumlah yang harus dibayar adalah total harga dikurangi diskon.
    jumlahBayar = totalHarga - diskon;

    // Tampilkan hasil perhitungan.
    System.out.println("Nama barang yang dibeli: " + namaBarang);
    System.out.println("Jumlah barang yang dibeli: " + jumlahBarang);
    System.out.println("Jumlah harga barang: Rp " + String.format("%,.2f", hargaBarang));
    System.out.println("Jumlah total harga: Rp " + String.format("%,.2f", totalHarga));
    System.out.println("Besaran diskon: " + String.format("%.0f", besaranDiskon * 100) + "%");
    System.out.println("Jumlah diskon: Rp " + String.format("%,.2f", diskon));
    System.out.println("Jumlah yang harus dibayar: Rp " + String.format("%,.2f", jumlahBayar));
  }
}