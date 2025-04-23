/* 
 * Nama         : Dhimas Luthfi Arnanda
 * NIM          : 24060123120040
 * Lab          : PBO B2
 * Nama File    : Mmain.java
 * Deskripsi    : berisi Aplikasi dari class Anabul, Kucing, Anjing, dan Burung
 * Tanggal      : 22 April 2025
 */
public class Mmain {
    public static void main(String[] args) {
        Anabul Kucing = new Kucing("Fony");
        Anabul Anjing = new Anjing("prime");
        Anabul Burung = new Burung("Frank");

        System.out.println("----- Kucing -----");
        Kucing.gerak();
        Kucing.bersuara();
        
        System.out.println("\n----- Anjing -----");
        Anjing.gerak();
        Anjing.bersuara();
        
        System.out.println("\n----- Burung -----");
        Burung.gerak();
        Burung.bersuara();
    }
}
