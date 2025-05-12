
package keluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */

/**
 * File         : ContohMetodeGeneric.java
 * Deskripsi    : kelas untuk menggunakan Datum dengan type generic, dan dengan pembatasan Anabul
 */
public class ContohMetodeGenerik {
    public <G extends Anabul> G fungsi (Datum<G> d) {
        return d.getIsi();
    }
}
