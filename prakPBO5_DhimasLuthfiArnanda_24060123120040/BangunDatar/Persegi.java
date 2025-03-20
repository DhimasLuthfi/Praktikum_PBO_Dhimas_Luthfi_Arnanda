/* 
* Nama File    : Persegi.java
* Deskripsi    : berisi atribut dan method dalam class Persegi
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
public class Persegi extends BangunDatar implements IResize {
    /* Atribut */
    private double sisi;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;
    }

    /* Selektor */
    // Menampilkan sisi
    public double getSisi() {
        return sisi;
    }

    // Menampilkan luas
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // Menampilkan keliling
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menampilkan diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    /* Mutator */
    // Mengubah nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menampilkan persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
        
    }

    // implementasi interface IResize
    // menambahkan ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }

}
