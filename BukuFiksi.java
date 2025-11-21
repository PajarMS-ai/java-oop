package com.perpustakaan.manajemen;

public class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String id, String judul, String penerbit, String genre) {
        super(id, judul, penerbit);
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Genre: " + genre;
    }
}