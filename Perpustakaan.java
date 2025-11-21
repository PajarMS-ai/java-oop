package com.perpustakaan.manajemen;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku cariBuku(String id) {
        for (Buku b : daftarBuku) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }
        for (Buku b : daftarBuku) {
            System.out.println(b.getInfo());
        }
    }

    public boolean ubahJudul(String id, String judulBaru) {
        Buku b = cariBuku(id);
        if (b != null) {
            b.setJudul(judulBaru);
            return true;
        }
        return false;
    }

    public boolean cekStatus(String id) {
        return cariBuku(id) != null;
    }
}