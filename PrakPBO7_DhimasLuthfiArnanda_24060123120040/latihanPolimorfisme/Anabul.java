/* 
 * Nama         : Dhimas Luthfi Arnanda
 * NIM          : 24060123120040
 * Lab          : PBO B2
 * Nama File    : Anabul.java
 * Deskripsi    : berisi attribut dan method dari class Anabul
 * Tanggal      : 22 April 2025
 */
public abstract class Anabul {
    /* Attribut */
    protected String nama;
    /* Method */
    public Anabul() {

    }
    public Anabul(String nama) {
        this.nama = nama;
    }
    public abstract void gerak();
    public abstract void bersuara();
}
