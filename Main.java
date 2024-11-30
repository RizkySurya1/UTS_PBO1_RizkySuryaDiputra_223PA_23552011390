/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasi_manajemen_wisata;

/**
 *
 * @author asrul
 */
public class Main extends LayananWisata {
    @Override
    void daftarPaket() {
        System.out.println("Paket berhasil didaftarkan.");
    }

    @Override
    void booking() {
        System.out.println("Paket berhasil dipesan.");
    }

    public static void main(String[] args) {
        PaketWisata alam = new WisataAlam("Paket Alam", "Tangkuban Perahu", 500000, 150000);
        PaketWisata budaya = new WisataBudaya("Paket Budaya", "Saung Angklung Udjo", 300000, 10, 20000);

        // Menampilkan informasi paket wisata
        System.out.println("=== Daftar Paket Wisata ===");
        System.out.println(alam);
        System.out.println("Total Biaya: Rp " + alam.hitungBiaya());
        System.out.println(budaya);
        System.out.println("Total Biaya: Rp " + budaya.hitungBiaya());

        // Simulasi Data Perjalanan
        Perjalanan perjalanan = new Perjalanan("2024-12-01", 5, "Dipesan");
        System.out.println("\n=== Data Perjalanan ===");
        System.out.println(perjalanan.getPerjalanan());

        // Simulasi perubahan data perjalanan
        perjalanan.setPerjalanan("2024-12-15", 15, "Selesai");
        System.out.println("Data Perjalanan (Update): " + perjalanan.getPerjalanan());

        // Booking dan Daftar Paket
        Main app = new Main();
        System.out.println("\n=== Layanan Wisata ===");
        app.daftarPaket();
        app.booking();
    }
}
