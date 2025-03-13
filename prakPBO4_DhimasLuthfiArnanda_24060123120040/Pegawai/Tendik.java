/* 
* Nama File    : Tendik.java
* Deskripsi    : berisi atribut dan method dalam class Tendik
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tendik extends pegawai {
    /* Atribut */
    private String bidang;
    private static int BUP = 55;
    private static int countTendik = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Tendik() {
        countTendik++;
    }

    // Konstruktor dengan parameter
    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
        countTendik++;
    }

    /* Selektor */
    // Menampilkan Bidang
    public String getBidang() {
        return bidang;
    }

    // Menghitung BUP
    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    // Menghitung tunjangan
    public double hitungtunjangan() {
        return 0.01 * hitungMasaKerja()/12 * getgajiPokok();
    }

    // Menampilkan Tendik
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy"); 
        super.printInfo();
        System.out.println("Bidang        : " + getBidang());
        System.out.println("Jabatan       : Tenaga Kependidikan");
        System.out.println("Masa Kerja    : " + hitungMasaKerja()/12 + " tahun " + hitungMasaKerja()%12 + " bulan");
        System.out.println("BUP           : " + hitungBUP().format(formatter));
        System.out.println("Tunjangan     : 1%  x " + hitungMasaKerja()/12 + " x " + 
                            String.format("%,.2f", getgajiPokok()) + " = Rp " + 
                            String.format("%,.2f", hitungtunjangan()));
    }

    // Menampilkan Jumlah Tendik
    public static void printCountTendik() {
        System.out.println("Jumlah Tendik  : " + countTendik);
    }
}
