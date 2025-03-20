/* 
* Nama File    : BangunDatar.java
* Deskripsi    : berisi atribut dan method dalam class Bangun Ruang
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
public abstract class BangunDatar {
    /* Atribut */
    protected int jmlSisi;
    protected String warna;
    protected String border;
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

    // Menampilkan Luas
    public abstract double getLuas();
    
    // Menampilkan keliling
    public abstract double getKeliling();

    // Menampilkan BangunDatar
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);

    }

    // Menampilkan jumlah BangunDatar
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Object Bangun Datar: " + counterBangunDatar);
    }

    // Cek kesamaan 2 luas bangun datar
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // Cek kesamaan 2 Keliling bangun datar
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }


}

/*
 * Bagian 4 – Access Modifier Protected
 * Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
 * tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
 * Mengapa?
 * 
 * Konstruktor dengan parameter pada class persegi tetap bisa direalisasikan, karena salah satu Lingkup 
 * dari protected adalah dapat diakses oleh subclass (pewarisan/inheritance), bahkan jika subclass berada 
 * di paket yang berbeda, karena persegi merupakan subclass dari class BangunDatar, class persegi tetap bisa 
 * mengakses attribut dari class parent nya yaitu BangunDatar.
 * 
 * 
 * Bagian 5 – Keyword Final
 * Keyword final yang diberikan pada kelas menjadikan kelas tersebut tidak dapat diwariskan, sedangkan
 * keyword final yang diberikan pada method menjadikan method tersebut tidak dapat di-override pada
 * subkelasnya.
 * Lakukan eksperimen penggunaan keyword final seperti berikut:
 * 1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
 * Persegi dan Lingkaran?
 * 
 * dengan menambahkan final pada class BangunDatar maka seluruh attribut dan method yang ada di dalam
 * class BangunRuang tidak akan bisa diakses oleh subclass nya yaitu persegi dan lingkaran. Secara singkatnya
 * kita tidak bisa melakukan pewarisan/membuat subclass dari bangundata.
 * 
 * 2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
 * printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
 * kelas Persegi dan Lingkaran?
 * 
 * program akan mengalami eror pada saat melakukan kompilasi karena class persegi dan lingkaran memiliki mathod printInfo() 
 * yang mengoverride method dari BangunDatar, karena method printInfo dari super class bangunDatar diberikan keyword final
 * maka method itu tidak dapat diakses oleh subclass nya yaitu persegi dan lingkaran. untuk mengatasi itu printInfo() pada
 * class persegi dan lingkaran bisa mengubah nama method nya menjadi printDetail() dan sebagainya atau memberikan tambahan 
 * parameter pada printInfo(....) untuk membedakan bentuknya.
 * public void printDetailPersegi() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
    public void printDetailLingkaran() {
        super.printInfo();
        System.out.println("Jari - Jari: " + jari);
    }
 * program akan berjalan dengan aman 
 */