
package KeluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Burung.java
 * Deskripsi    : class turunan dari class induk Anabul untuk merepresentasikan jenis dan prilaku burung
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

