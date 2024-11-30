/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_wisata;

/**
 *
 * @author asrul
 */
class Perjalanan {
    private String tanggalPerjalanan;
    private int jumlahPeserta;
    private String statusPemesanan;

    public Perjalanan(String tanggalPerjalanan, int jumlahPeserta, String statusPemesanan) {
        this.tanggalPerjalanan = tanggalPerjalanan;
        this.jumlahPeserta = jumlahPeserta;
        this.statusPemesanan = statusPemesanan;
    }

    public String getPerjalanan() {
        return "Tanggal: " + tanggalPerjalanan + ", Jumlah Peserta: " + jumlahPeserta + ", Status: " + statusPemesanan;
    }

    public void setPerjalanan(String tanggal, int jumlah, String status) {
        this.tanggalPerjalanan = tanggal;
        this.jumlahPeserta = jumlah;
        this.statusPemesanan = status;
    }
}
