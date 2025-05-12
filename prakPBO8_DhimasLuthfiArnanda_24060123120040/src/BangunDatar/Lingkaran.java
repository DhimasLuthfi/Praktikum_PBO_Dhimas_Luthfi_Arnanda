
package BangunDatar;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Lingkaran.java
 * Deskripsi    : Implementasi Lingkaran sebagai bangun datar
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double getJejari() {
        return this.jejari;
    }

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }

    @Override
    public double hitungLuas(){
        return jejari*jejari*3.14;
    }
}