
package KeluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */

/**
 * File         : Mmain.java
 * Deskripsi    : implementasi dari class Anabul dan generic
 */
import java.util.Random;
public class Mmain {
    public static void main(String[] args) throws Eksepsi {
        try {
            // Membuat objek koleksi dengan kapasitas 10
            Koleksi koleksiObjek = new Koleksi(10);
            
            // Menambahkan data ke dalam koleksi Objek
            koleksiObjek.add("Anggora");
            koleksiObjek.add("Cihuahua");
            koleksiObjek.add("Perkutut");
            koleksiObjek.add("Heli");
            koleksiObjek.add("Persia");
            
            // Menampilkan seluruh isi koleksi objek
            System.out.println("Isi Koleksi : ");
            koleksiObjek.showAll();
            
            System.out.println("Jumlah Elemen : "+ koleksiObjek.getSize());

            System.out.println("--------------------------------");
            
            // Menghapus salah satu data
            System.out.println("Menghapus: 'Heli'");
            String dihapus = koleksiObjek.delete("Heli");
            if (dihapus != null) {
                System.out.println("Objek dihapus: " + dihapus);
            }

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah penghapusan:");
            koleksiObjek.showAll();
            System.out.println("Jumlah elemen: " + koleksiObjek.getSize());

            // Edit data ke-1 (indeks 0)
            koleksiObjek.setIsi(0, "Jalak");

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah edit:");
            koleksiObjek.showAll();
            
            System.out.println("--------------------------------");
            
            // Coba tambah lebih dari kapasitas
            System.out.println("Setelah di tambahkan data random :");
            String[] dataAcak = {"Kenari","Lovebird","Beo","Golden Retriever","Labrador","Bulldog","Beagle","Persia","Anggora","Bengal","Sphynx"};
            Random random = new Random();

            for (int i = koleksiObjek.getSize(); i < koleksiObjek.getWadah().length; i++) {
                String objekRandom = dataAcak[random.nextInt(dataAcak.length)];
                koleksiObjek.add(objekRandom);
            }

            System.out.println("Isi :");
            
            koleksiObjek.showAll();
            
        } catch (Eksepsi e) {
            System.out.println("Terjadi eksepsi : " + e.getMessage());
        }
    }
}