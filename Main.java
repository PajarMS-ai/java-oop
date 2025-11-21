package com.perpustakaan.manajemen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Perpustakaan p = new Perpustakaan();

        int pilih = 0;

        while (pilih != 6) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Ubah Buku");
            System.out.println("5. Cek Status Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Jenis Buku:");
                    System.out.println("1. Fiksi");
                    System.out.println("2. Non Fiksi");
                    System.out.print("Pilih: ");
                    int j = in.nextInt();
                    in.nextLine();

                    System.out.print("ID: ");
                    String id = in.nextLine();
                    System.out.print("Judul: ");
                    String judul = in.nextLine();
                    System.out.print("Penerbit: ");
                    String penerbit = in.nextLine();

                    if (j == 1) {
                        System.out.print("Genre: ");
                        String genre = in.nextLine();
                        p.tambahBuku(new BukuFiksi(id, judul, penerbit, genre));
                    } else {
                        System.out.print("Kategori: ");
                        String kategori = in.nextLine();
                        p.tambahBuku(new BukuNonFiksi(id, judul, penerbit, kategori));
                    }
                    System.out.println("Buku berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("=== Daftar Buku ===");
                    p.tampilkanBuku();
                    break;

                case 3:
                    System.out.print("ID buku: ");
                    Buku b = p.cariBuku(in.nextLine());
                    System.out.println(b != null ? b.getInfo() : "Buku tidak ditemukan.");
                    break;

                case 4:
                    System.out.print("ID buku: ");
                    String ubahId = in.nextLine();
                    System.out.print("Judul baru: ");
                    String baru = in.nextLine();
                    System.out.println(
                        p.ubahJudul(ubahId, baru)
                        ? "Berhasil diubah."
                        : "Gagal, ID tidak ditemukan."
                    );
                    break;

                case 5:
                    System.out.print("ID buku: ");
                    System.out.println(
                        p.cekStatus(in.nextLine())
                        ? "BUKU TERSEDIA"
                        : "BUKU TIDAK ADA"
                    );
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}