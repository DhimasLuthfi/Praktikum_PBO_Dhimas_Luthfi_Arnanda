
package BangunDatar;

/*
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : BangunDatar.java
 * Deskripsi    : Kelas abstrak untuk bangun datar
 */
import java.util.Iterator;

public abstract class BangunDatar {
    public abstract double hitungKeliling();
    
    public abstract double hitungLuas();

    Iterator<BangunDatar> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
