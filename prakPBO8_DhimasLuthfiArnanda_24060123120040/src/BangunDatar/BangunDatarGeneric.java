
package BangunDatar;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : BangunDatarGeneric.java
 * Deskripsi    : kelas konstruksi generic untuk BangunDatar
 */
import java.util.Iterator;

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
    
}