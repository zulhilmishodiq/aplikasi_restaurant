// Class Menu digunakan untuk menyimpan data menu restoran
public class Menu {

    String nama;
    int harga;
    String kategori;

    // Constructor untuk mengisi data menu
    public Menu(String nama, int harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
}