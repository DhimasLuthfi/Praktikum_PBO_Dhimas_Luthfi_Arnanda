/* 
* Nama File    : Lingkaran.java
* Deskripsi    : berisi atribut dan method dalam class Lingkaran
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
public class Lingkaran extends BangunDatar implements IResize {
    /* Attribute */
    private double jari;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari; 
    }
    /* Selektor */
    // Menampilkan jari jari
    public double getJari() {
        return jari;
    }

    // Menampilkan Luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    /* Mutator */
    // Menubah nilai jari jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menampilkan Keliling Lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Menampilkan Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari - Jari : " + jari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    // implementasi interface IResize
    // menambahkan ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}
