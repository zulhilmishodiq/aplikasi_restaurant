import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk input user
        Scanner input = new Scanner(System.in);

        // Array menu restoran
        Menu[] daftarMenu = {
                new Menu("Nasi Goreng", 25000, "Makanan"),
                new Menu("Mie Ayam", 20000, "Makanan"),
                new Menu("Ayam Bakar", 30000, "Makanan"),
                new Menu("Sate Ayam", 35000, "Makanan"),
                new Menu("Es Teh", 10000, "Minuman"),
                new Menu("Jus Jeruk", 15000, "Minuman"),
                new Menu("Kopi", 12000, "Minuman"),
                new Menu("Milkshake", 20000, "Minuman")
        };

        // Menampilkan daftar menu
        tampilMenu(daftarMenu);

        // Array untuk menyimpan pilihan menu
        int[] pilihan = new int[4];

        // Array untuk menyimpan jumlah pesanan
        int[] jumlah = new int[4];

        // Array untuk menyimpan subtotal tiap item
        int[] totalItem = new int[4];

        System.out.println("\n===== INPUT PESANAN =====");

        // Input maksimal 4 pesanan
        for (int i = 0; i < 4; i++) {

            System.out.print("Pilih Menu Ke-" + (i + 1) + " (Nomor Menu): ");
            pilihan[i] = input.nextInt();

            System.out.print("Jumlah : ");
            jumlah[i] = input.nextInt();
        }

        // Variabel perhitungan
        int totalPesanan = 0;
        double diskon = 0;
        double potonganMinuman = 0;

        // Penanda promo minuman aktif atau tidak
        boolean promoMinuman = false;

        // ==========================
        // PROSES MENGHITUNG PESANAN
        // ==========================

        for (int i = 0; i < 4; i++) {

            // Mengubah nomor menu menjadi index array
            int index = pilihan[i] - 1;

            // Validasi agar index tidak keluar dari batas array
            if (index >= 0 && index < daftarMenu.length) {

                // Menghitung subtotal item
                totalItem[i] = daftarMenu[index].harga * jumlah[i];

                // Menambahkan ke total pesanan
                totalPesanan += totalItem[i];

                // Mengecek apakah menu termasuk minuman
                if (daftarMenu[index].kategori.equalsIgnoreCase("Minuman")) {

                    // Nested If
                    // Promo minuman aktif jika total pesanan > 50.000
                    if (totalPesanan > 50000) {
                        promoMinuman = true;
                    }
                }
            }
        }

        // ==========================
        // HITUNG PAJAK DAN SERVICE
        // ==========================

        double pajak = totalPesanan * 0.10;
        int service = 20000;

        double subtotal = totalPesanan + pajak + service;

        // ==========================
        // HITUNG DISKON
        // ==========================

        // Jika subtotal lebih dari 100 ribu
        // maka mendapat diskon 10%
        if (subtotal > 100000) {
            diskon = subtotal * 0.10;
        }

        // ==========================
        // PROMO MINUMAN
        // ==========================

        if (promoMinuman) {

            // Mencari minuman pertama yang dipesan
            for (int i = 0; i < 4; i++) {

                int index = pilihan[i] - 1;

                // Menu minuman dimulai dari index 4
                if (index >= 4) {

                    // Switch Case untuk menentukan promo
                    switch (daftarMenu[index].nama) {

                        case "Es Teh":
                            potonganMinuman = 10000;
                            break;

                        case "Jus Jeruk":
                            potonganMinuman = 15000;
                            break;

                        case "Kopi":
                            potonganMinuman = 12000;
                            break;

                        case "Milkshake":
                            potonganMinuman = 20000;
                            break;

                        default:
                            potonganMinuman = 0;
                    }

                    break;
                }
            }
        }

        // Menghitung total akhir pembayaran
        double totalBayar = subtotal - diskon - potonganMinuman;

        // ==========================
        // CETAK STRUK
        // ==========================

        System.out.println("\n========== STRUK PEMBAYARAN ==========");

        for (int i = 0; i < 4; i++) {

            int index = pilihan[i] - 1;

            if (index >= 0 && index < daftarMenu.length) {

                System.out.println("Menu       : " + daftarMenu[index].nama);
                System.out.println("Harga      : Rp." + daftarMenu[index].harga);
                System.out.println("Jumlah     : " + jumlah[i]);
                System.out.println("Sub Total  : Rp." + totalItem[i]);
                System.out.println();
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Total Pesanan   : Rp." + totalPesanan);
        System.out.println("Pajak 10%       : Rp." + pajak);
        System.out.println("Biaya Pelayanan : Rp." + service);

        // If Else
        if (diskon > 0) {
            System.out.println("Diskon 10%      : Rp." + diskon);
        } else {
            System.out.println("Diskon 10%      : Tidak Ada");
        }

        // Nested If
        if (potonganMinuman > 0) {
            System.out.println("Promo Minuman   : Rp." + potonganMinuman);
        } else {
            System.out.println("Promo Minuman   : Tidak Ada");
        }

        System.out.println("-------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp." + totalBayar);
    }

    // Method untuk menampilkan menu restoran
    public static void tampilMenu(Menu[] daftarMenu) {

        System.out.println("========== MENU MAKANAN ==========");

        // Menampilkan menu makanan
        for (int i = 0; i < 4; i++) {

            System.out.println(
                    (i + 1) + ". "
                    + daftarMenu[i].nama
                    + " - Rp." + daftarMenu[i].harga);
        }

        System.out.println("\n========== MENU MINUMAN ==========");

        // Menampilkan menu minuman
        for (int i = 4; i < 8; i++) {

            System.out.println(
                    (i + 1) + ". "
                    + daftarMenu[i].nama
                    + " - Rp." + daftarMenu[i].harga);
        }
    }
}