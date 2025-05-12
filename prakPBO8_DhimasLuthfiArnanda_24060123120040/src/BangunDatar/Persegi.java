
package BangunDatar;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Persegi.java
 * Deskripsi    : Implementasi Persegi sebagai bangun datar
 */


public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
       this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
