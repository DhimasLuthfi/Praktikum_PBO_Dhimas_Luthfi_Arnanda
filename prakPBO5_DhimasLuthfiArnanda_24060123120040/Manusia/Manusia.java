/* 
* Nama File    : Manusia.java
* Deskripsi    : berisi atribut dan method dalam class Manusia
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/

import java.time.LocalDate;

public abstract  class Manusia {
    /* Attribut */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor Manusia tanpa parameter
    public Manusia() {
        counterMns++;
    }

    // Konstruktor Manusia dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* Selektor */
    // Menampilkan nama
    public String getNama() {
        return nama;
    }

    // Menampilkan tgl mulai kerja
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    // Menampilkan alamat
    public String getAlamat() {
        return alamat;
    }

    // Menampilkan Pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    /* Selektpr */
    // Mengubah nilai alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Menagubah nilai penadpatan 
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Menampilkan detail Manusia
    public void printInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : Rp " + String.format("%,.2f", pendapatan));
    }

    // Menampilkan jumlah Manusia
    public static int getCounterManusia() {
        return counterMns;
    }

    // HitungMasaKerja
    public abstract int hitungMasaKerja();
}
