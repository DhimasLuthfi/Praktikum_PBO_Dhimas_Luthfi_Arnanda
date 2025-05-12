
package keluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */

/**
 * File         : Kucing.java
 * Deskripsi    : class turunan dari class induk Anabul untuk merepresentasikan jenis dan prilaku Kucing
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

