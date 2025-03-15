/* 
* Nama File    : pegawai.java
* Deskripsi    : berisi atribut dan method dalam class pegawai
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class pegawai {
    /* Atribut */
    protected double gajiPokok;
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected static int countPegawai = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public pegawai() {
        countPegawai++;
    }

    // Konstruktor dengan parameter
    public pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
        this.TMT = LocalDate.parse(TMT);
        this.gajiPokok = gajiPokok;
        countPegawai++;
    }

    /* Selektor */
    // Menampilkan NIP
    public String getNIP() {
        return NIP;
    }

    // Menampilkan nama
    public String getNama() {
        return nama;
    }

    // Menampilkan tanggal lahir
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    // Menampilkan terhitung Mulai tanggal (TMT)
    public LocalDate getTMT() {
        return TMT;
    }

    // Menampilkan gajipokok
    public double getgajiPokok() {
        return gajiPokok;
    }

    /* Mutator */
    // Mengubah nilai gaji pokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Menampilkan detail pegawai
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(formatter));
        System.out.println("TMT           : " + TMT.format(formatter));
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok).replace(",", ".").replace(".", ","));
    }

    // Menghitung masa kerja dalam bulan
    public int gethitungMasaKerja() {
        Period masaKerja = Period.between(TMT, LocalDate.now());
        return masaKerja.getYears() * 12 + masaKerja.getMonths(); // Menghitung total bulan
    }

    // Menghitung jumlah pegawai
    public static void printCountPegawai() {
        System.out.println("Jumlah Pegawai : " + countPegawai);
    }
}
