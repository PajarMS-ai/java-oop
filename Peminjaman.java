package com.perpustakaan.manajemen;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggal;

    public Peminjaman(Anggota anggota, Buku buku, String tanggal) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggal = tanggal;
    }

    public String getInfo() {
        return anggota.getInfo() + "\nMeminjam buku: " + buku.getJudul()
                + "\nTanggal: " + tanggal;
    }
}