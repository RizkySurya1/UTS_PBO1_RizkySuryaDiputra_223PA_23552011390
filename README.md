UTS Pemrograman Berorientasi Obyek 1

•	Mata Kuliah: Pemrograman Berorientasi Obyek 1

•	Dosen Pengampu: Muhammad Ikhwan Fathulloh

Profil

•	Nama: Rizky Surya Diputra

•	NIM: 23552011390

•	Studi Kasus: Aplikasi Manajemen Wisata

Judul Studi Kasus

	“ Implementasi Konsep OOP dalam Aplikasi Manajemen Wisata Menggunakan Java “

Penjelasan 4 pilar OOP dalam Studi Kasus

1.	Inheritance
   
•	Definisi: Inheritance memungkinkan suatu kelas (subclass) mewarisi atribut dan metode dari kelas lain (superclass).

•	Penerapan dalam Aplikasi:

a.	Kelas PaketWisata adalah kelas induk yang mendefinisikan atribut dasar seperti namaPaket, destinasi, dan hargaDasar.

b.	Kelas WisataAlam dan WisataBudaya adalah kelas turunan yang menambahkan atribut spesifik, seperti biayaTransportasi pada WisataAlam atau diskonPeserta pada WisataBudaya.

2.	Encapsulation
   
•	Definisi: Encapsulation adalah proses menyembunyikan detail implementasi suatu kelas dengan menjaga atribut tetap private dan menyediakan metode getter dan setter untuk mengaksesnya.

•	Penerapan dalam Aplikasi:

a.	Kelas Perjalanan menyimpan data perjalanan, seperti tanggal, jumlahPeserta, dan statusPemesanan, sebagai atribut private.

b.	Data hanya dapat diakses atau dimodifikasi melalui metode publik seperti setPerjalanan() dan getPerjalanan()

4.	Polymorphism
   
•	Definisi: Polimorfisme memungkinkan metode dengan nama yang sama memiliki implementasi yang berbeda di kelas turunan.

•	Penerapan dalam Aplikasi:

a.	Metode abstrak hitungBiaya() di kelas PaketWisata di-override oleh kelas turunan:

b.	Pada WisataAlam, metode hitungBiaya() menghitung biaya dengan menambahkan biayaTransportasi dan biayaPemandu.

c.	Pada WisataBudaya, metode hitungBiaya() menghitung biaya dengan mengurangi diskonPeserta dari hargaDasar.

5.	Abstract
   
•	Definisi: Abstraction menyembunyikan detail implementasi yang kompleks dan hanya menampilkan fungsionalitas penting kepada pengguna.

•	Penerapan dalam Aplikasi:

a.	Kelas PaketWisata adalah kelas abstrak:

Tidak dapat diinstansiasi langsung, tetapi berfungsi sebagai blueprint untuk kelas turunan.

b.	Mendefinisikan metode abstrak hitungBiaya(), yang harus diimplementasikan oleh semua kelas turunan.

•	Interface LayananWisata mendefinisikan kontrak metode seperti tambahPaket(), bookingPerjalanan(), dan buatLaporan(), yang harus diimplementasikan oleh kelas yang menggunakannya (dalam hal ini ManajemenWisata).

Demo

•	Github: https://github.com/RizkySurya1/UTS_PBO1_RizkySuryaDiputra_223PA_23552011390

•	Youtube : 
