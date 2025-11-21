package com.perpustakaan.manajemen;

public class BukuNonFiksi extends Buku {
    private String kategori;

    public BukuNonFiksi(String id, String judul, String penerbit, String kategori) {
        super(id, judul, penerbit);
        this.kategori = kategori;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Kategori: " + kategori;
    }
}