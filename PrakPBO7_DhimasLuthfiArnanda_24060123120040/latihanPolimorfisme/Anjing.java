/* 
 * Nama         : Dhimas Luthfi Arnanda
 * NIM          : 24060123120040
 * Lab          : PBO B2
 * Nama File    : Anjing.java
 * Deskripsi    : berisi attribut dan method dari class Anjing
 * Tanggal      : 22 April 2025
 */
public class Anjing extends Anabul {
    /* Attribut */

    /* Method */
    public Anjing() {

    }
    public Anjing(String nama) {
        super(nama);
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak melata");
    }
    @Override
    public void bersuara() {
        System.out.println("bersuara guk-guk");
    }
}
