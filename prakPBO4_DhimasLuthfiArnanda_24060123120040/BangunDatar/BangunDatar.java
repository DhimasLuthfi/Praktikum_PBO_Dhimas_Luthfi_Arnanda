/* 
* Nama File    : BangunDatar.java
* Deskripsi    : berisi atribut dan method dalam class Bangun Ruang
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
public class BangunDatar {
    /* Atribut */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor BangunDatar tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor BangunDatar dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* Selektor */
    // Menampilkan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Menampilkan warna
    public String getWarna() {
        return warna;
    }
    
    // Menampilkan border
    public String getBorder() {
        return border;
    }
    
    /* Mutator */
    // Mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengubah nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengubah nilai border
    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan BangunDatar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Menampilkan jumlah BangunDatar
    public static void printCounterBangunRuang() {
        System.out.println("Jumlah Object Bangun Datar: "+ counterBangunDatar);
    }
}
