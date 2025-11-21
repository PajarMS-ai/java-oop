package com.perpustakaan.manajemen;

public class Anggota {
    private String id;
    private String nama;
    private String alamat;

    public Anggota(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getInfo() {
        return "ID Anggota: " + id + ", Nama: " + nama + ", Alamat: " + alamat;
    }
}