/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_wisata;

/**
 *
 * @author asrul
 */
class PaketWisata {
    String namaPaket;
    String destinasi;
    double harga;

    public PaketWisata(String namaPaket, String destinasi, double harga) {
        this.namaPaket = namaPaket;
        this.destinasi = destinasi;
        this.harga = harga;
    }

    public double hitungBiaya() {
        return harga; // Default, bisa di-override
    }

    @Override
    public String toString() {
        return "Paket: " + namaPaket + ", Destinasi: " + destinasi + ", Harga: Rp " + harga;
    }
}
