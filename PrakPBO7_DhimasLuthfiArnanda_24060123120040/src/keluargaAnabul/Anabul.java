
package keluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */

/**
 * File         : Anabul.java
 * Deskripsi    : Program class anabul sebagai class induk
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
