/* 
 * Nama         : Dhimas Luthfi Arnanda
 * NIM          : 24060123120040
 * Lab          : PBO B2
 * Nama File    : Kucing.java
 * Deskripsi    : berisi attribut dan method dari class Kucing
 * Tanggal      : 22 April 2025
 */
public class Kucing extends Anabul {
    /* Attribut */

    /* Method */
    public Kucing() {

    }
    public Kucing(String nama) {
        super(nama);
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak melata");
    }
    @Override
    public void bersuara() {
        System.out.println("bersuara meong");
    }
}
