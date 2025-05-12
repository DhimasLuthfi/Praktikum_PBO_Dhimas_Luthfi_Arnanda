
package KeluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Anjing.java
 * Deskripsi    : class turunan dari class induk Anabul untuk merepresentasikan jenis dan prilaku Anjing
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