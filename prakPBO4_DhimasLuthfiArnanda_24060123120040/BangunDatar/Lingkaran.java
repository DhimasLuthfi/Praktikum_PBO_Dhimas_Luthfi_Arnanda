/* 
* Nama File    : Lingkaran.java
* Deskripsi    : berisi atribut dan method dalam class Lingkaran
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
public class Lingkaran extends BangunDatar{
    /* Attribute */
    private double jari;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter/2; 
    }
    /* Selektor */
    // Menampilkan jari jari
    public double getJari() {
        return jari;
    }

    // Menampilkan Luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    /* Mutator */
    // Menubah nilai jari jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menampilkan Keliling Lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}
