/* 
* Nama File    : Persegi.java
* Deskripsi    : berisi atribut dan method dalam class Persegi
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
public class Persegi extends BangunDatar {
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
        super(4, warna, border); // Memanggil konstruktor superclass
        this.sisi = sisi;
    }

    /* Selektor */
    // Menampilkan sisi
    public double getSisi() {
        return sisi;
    }

    // Menampilkan luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Menampilkan keliling
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
        System.out.println("Sisi: " + sisi);
    }


}
