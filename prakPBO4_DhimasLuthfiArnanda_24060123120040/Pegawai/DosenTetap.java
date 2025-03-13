/* 
* Nama File    : DosenTetap.java
* Deskripsi    : berisi atribut dan method dalam class Dosen Tetap
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    /* Atribut */
    private String NIDN;
    private static int BUP = 65; 

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public DosenTetap() {
        
    }

    // Konstruktor dengan parameter
    public DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    /* Selektor */
    // Menampilkan NIDN
    public String getNIDN() {
        return NIDN;
    }

    // Menghitung BUP
    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    // Menghitung tunjangan
    public double hitungtunjangan() {
        return 0.02 * hitungMasaKerja()/12 * getgajiPokok();
    }

    // Menampilkan Dosen Tetap
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy"); 
        super.printInfo();
        System.out.println("Masa Kerja    : " + hitungMasaKerja()/12 + " tahun " + hitungMasaKerja()%12 + " bulan");
        System.out.println("NIDN          : " + NIDN);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("BUP           : " + hitungBUP().format(formatter));
        System.out.println("Tunjangan     : 2%  x " + hitungMasaKerja()/12 + " x " + 
                            String.format("%,.2f", getgajiPokok()) + " = Rp " + 
                            String.format("%,.2f", hitungtunjangan()));
    }
}
