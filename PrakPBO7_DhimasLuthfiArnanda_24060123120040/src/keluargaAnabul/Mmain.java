
package keluargaAnabul;

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
import java.util.ArrayList;
public class Mmain {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("Generik\n");
        // Isiniasi Generic dengan type Anabul
        Datum<Anabul> D = new Datum<>();
        ContohMetodeGenerik Contoh = new ContohMetodeGenerik();

        // Menambahkan Data 
        D.setIsi(new Anjing("Cihuahua"));
        Contoh.fungsi(D).gerak();
        Contoh.fungsi(D).bersuara();
        System.out.println();

        D.setIsi(new Kucing("Anggora"));
        Contoh.fungsi(D).gerak();
        Contoh.fungsi(D).bersuara();
        System.out.println();

        D.setIsi(new Burung("Perkutut"));
        Contoh.fungsi(D).gerak();
        Contoh.fungsi(D).bersuara();
        System.out.println();

        System.out.println("--------------------------------");
        System.out.println("Bukan generik\n");

        Anabul Anabul1 = new Kucing("Anggora");
        Anabul Anabul2 = new Anjing("Cihuahua");
        Anabul Anabul3 = new Burung("Perkutut");

        ArrayList<Anabul> hewan = new ArrayList<>();
        hewan.add(Anabul1);
        hewan.add(Anabul2);
        hewan.add(Anabul3);

        for (Anabul haiwan : hewan) {
            // haiwan.getNama();
            haiwan.gerak();
            haiwan.bersuara();
            System.out.println();
        }
    }
}
