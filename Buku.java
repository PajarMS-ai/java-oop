package com.perpustakaan.manajemen;

public class Buku {
    private String id;
    private String judul;
    private String penerbit;

    public Buku(String id, String judul, String penerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
    }

    public String getId() { return id; }
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getPenerbit() { return penerbit; }
    public void setPenerbit(String penerbit) { this.penerbit = penerbit; }

    public String getInfo() {
        return "ID: " + id + ", Judul: " + judul + ", Penerbit: " + penerbit;
    }
}