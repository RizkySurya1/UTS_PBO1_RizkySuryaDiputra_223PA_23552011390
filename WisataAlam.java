/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_wisata;

/**
 *
 * @author asrul
 */
class WisataAlam extends PaketWisata {
    double biayaTransportasi;

    public WisataAlam(String namaPaket, String destinasi, double harga, double biayaTransportasi) {
        super(namaPaket, destinasi, harga);
        this.biayaTransportasi = biayaTransportasi;
    }

    @Override
    public double hitungBiaya() {
        return super.harga + biayaTransportasi;
    }
}
