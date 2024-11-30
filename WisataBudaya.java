/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_wisata;

/**
 *
 * @author asrul
 */
class WisataBudaya extends PaketWisata {
  int jumlahPeserta;
  double diskonPerPeserta;

  public WisataBudaya(
      String namaPaket,
      String destinasi,
      double harga,
      int jumlahPeserta,
      double diskonPerPeserta) {
    super(namaPaket, destinasi, harga);
    this.jumlahPeserta = jumlahPeserta;
    this.diskonPerPeserta = diskonPerPeserta;
  }

  @Override
  public double hitungBiaya() {
    return super.harga - (jumlahPeserta * diskonPerPeserta);
  }
}
