
package koleksiGeneric;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Main.java
 * Deskripsi    : Implementasi dari class Koleksi
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek koleksi dengan kapasitas 10
            Koleksi k = new Koleksi(10);

            // Menambahkan data ke dalam koleksi
            k.add("Nadia");
            k.add("Damar");
            k.add("Nikko");
            k.add("Albert");
            k.add("Cintia");

            // Menampilkan seluruh isi koleksi
            System.out.println("Isi koleksi:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());
            
            System.out.println();

            // Menghapus salah satu data
            System.out.println("Hapus 'Albert'");
            String dihapus = k.delete("Albert");
            if (dihapus != null) {
                System.out.println("Yang dihapus: " + dihapus);
            }

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah penghapusan:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());

            // Edit data ke-1 (indeks 0)
            k.setIsi(0, "Jesica");

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah edit:");
            k.showAll();

            // Coba tambah lebih dari kapasitas
            System.out.println();
            int bound = ((k.getWadah().length - k.getSize())-1);
            
            for (int i = 0; i <= bound; i++) {
                k.add("Null");
            }

            System.out.println("Show all :");
            k.showAll();
            
            System.out.println();
            System.out.println("Mencoba tambahkan objek");
            k.add("test aj");
        } catch (Eksepsi e) {
            System.out.println("Terjadi Eksepsi: " + e.getMessage());
        }
    }
}