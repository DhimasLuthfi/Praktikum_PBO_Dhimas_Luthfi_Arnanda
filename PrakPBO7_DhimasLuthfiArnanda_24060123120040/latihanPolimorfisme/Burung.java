/* 
 * Nama         : Dhimas Luthfi Arnanda
 * NIM          : 24060123120040
 * Lab          : PBO B2
 * Nama File    : Burung.java
 * Deskripsi    : berisi attribut dan method dari class Burung
 * Tanggal      : 22 April 2025
 */
public class Burung extends Anabul {
    /* Attribut */

    /* Method */
    public Burung() {

    }
    public Burung(String nama) {
        super(nama);
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak terbang");
    }
    @Override
    public void bersuara() {
        System.out.println("bersuara cuit");
    }
}
