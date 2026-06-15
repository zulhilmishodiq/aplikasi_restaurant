# Tugas Praktik 1 - Pemrograman Berbasis Desktop

## Identitas Mahasiswa

* Nama : Zulhilmi Shodiq
* NIM : 053343025
* Mata Kuliah : Pemrograman Berbasis Desktop

---

# Deskripsi Program

Program ini merupakan aplikasi sederhana restoran yang dibuat menggunakan bahasa Java.

Program dapat menampilkan daftar menu makanan dan minuman, menerima pesanan pelanggan, menghitung total biaya, memberikan diskon dan promo, serta mencetak struk pembayaran.

---

# Fitur Program

1. Menampilkan daftar menu makanan dan minuman.
2. Input pesanan maksimal 4 menu.
3. Menggunakan Array untuk menyimpan data menu dan pesanan.
4. Menghitung total biaya pesanan.
5. Menghitung pajak sebesar 10%.
6. Menambahkan biaya pelayanan sebesar Rp20.000.
7. Memberikan diskon 10% jika total pembayaran melebihi Rp100.000.
8. Memberikan promo minuman jika total pesanan melebihi Rp50.000.
9. Menampilkan struk pembayaran.

---

# Struktur File

Project terdiri dari 2 file utama:

## Menu.java

Class untuk merepresentasikan data menu restoran.

Atribut:

* nama
* harga
* kategori

## Main.java

Class utama yang berfungsi untuk:

* Menampilkan menu
* Menerima input pesanan
* Menghitung total pembayaran
* Menghitung pajak
* Menghitung diskon
* Menghitung promo minuman
* Menampilkan struk pembayaran

---

# Konsep Pemrograman yang Digunakan

Program ini telah mengimplementasikan:

### Class dan Object

Digunakan pada class Menu dan object menu restoran.

### Array

Digunakan untuk menyimpan:

* daftarMenu
* pilihan
* jumlah
* totalItem

### Method

Digunakan pada method:

```java
tampilMenu()
```

### String

Digunakan pada atribut nama dan kategori.

### Struktur Keputusan

#### If

Digunakan untuk menentukan diskon.

#### If Else

Digunakan untuk menampilkan informasi diskon dan promo.

#### Nested If

Digunakan untuk menentukan promo minuman.

#### Switch Case

Digunakan untuk menentukan jenis promo berdasarkan minuman yang dipilih.

---

# Cara Menjalankan Program

1. Buka project pada code editor VS Code.
2. Pastikan file Menu.java dan Main.java berada dalam satu project.
3. Jalankan file Main.java.
4. Masukkan nomor menu sesuai daftar yang ditampilkan.
5. Masukkan jumlah pesanan.
6. Program akan menampilkan struk pembayaran secara otomatis.

---

# Contoh Input

Pilih Menu Ke-1 : 1
Jumlah : 2

Pilih Menu Ke-2 : 5
Jumlah : 2

Pilih Menu Ke-3 : 4
Jumlah : 1

Pilih Menu Ke-4 : 7
Jumlah : 1

---

# Contoh Output

========== STRUK PEMBAYARAN ==========

Menu       : Nasi Goreng
Harga      : Rp.25000
Jumlah     : 2
Sub Total  : Rp.50000

Menu       : Es Teh
Harga      : Rp.10000
Jumlah     : 2
Sub Total  : Rp.20000

Menu       : Sate Ayam
Harga      : Rp.35000
Jumlah     : 1
Sub Total  : Rp.35000

Menu       : Kopi
Harga      : Rp.12000
Jumlah     : 1
Sub Total  : Rp.12000

Total Pesanan   : Rp.117000
Pajak 10%       : Rp.11700
Biaya Pelayanan : Rp.20000
Diskon 10%      : Rp.14870
Promo Minuman   : Rp.10000

TOTAL BAYAR     : Rp.123830

---

# Kesimpulan

Program berhasil memenuhi seluruh ketentuan Tugas Praktik 1, yaitu menggunakan:

* Class dan Object
* Array
* Method
* String
* If
* If Else
* Nested If
* Switch Case

Serta mampu melakukan pengolahan data pesanan restoran hingga menghasilkan struk pembayaran secara otomatis.
