package com.yazidmf.resepmakanan;

import java.io.Serializable;

public class ResepMakananModel implements Serializable {
    private String judul;
    private String deskripsi;
    private int gambar;
    private String isi;

    public ResepMakananModel() {
    }

    public ResepMakananModel(String judul, int gambar, String deskripsi, String isi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.isi = isi;
    }

    public ResepMakananModel(String judul, String deskripsi, String isi) {
        this.judul = judul;

        this.deskripsi = deskripsi;
        this.isi = isi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
