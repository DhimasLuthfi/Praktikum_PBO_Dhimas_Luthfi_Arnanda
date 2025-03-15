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

    // Menghitung BUP (tahun lahir + 65 tahun + 1 bulan)
    public LocalDate gethitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    // Menghitung tunjangan (2% * tahun bekerja * gaji pokok)
    public double gethitungTunjangan() {
        return 0.02 * gethitungMasaKerja()/12 * getgajiPokok();
    }

    // Menampilkan detail Dosen Tetap
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy"); 
        super.printInfo();
        System.out.println("Masa Kerja    : " + gethitungMasaKerja()/12 + " tahun " + gethitungMasaKerja()%12 + " bulan");
        System.out.println("NIDN          : " + NIDN);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("BUP           : " + gethitungBUP().format(formatter));
        System.out.println("Tunjangan     : 2%  x " + gethitungMasaKerja()/12 + " x " + 
                            String.format("%,.2f", getgajiPokok()) + " = Rp " + 
                            String.format("%,.2f", gethitungTunjangan()));
    }
}
