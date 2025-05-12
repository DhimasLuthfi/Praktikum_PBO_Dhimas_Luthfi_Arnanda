
package KeluargaAnabul;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Datum.java
 * Deskripsi    : class yang membungkus data dan bisa disimpan objek generik dengan type tertentu
 */
public class Datum<G> {
    private G isi;

    public Datum() {
        
    }
    
    public Datum(G isi) {
        this.isi = isi;
    }

    public G getIsi() {
        return isi;
    }

    public void setIsi(G isi) {
        this.isi = isi;
    }
}
