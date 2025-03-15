/* 
* Nama File    : DosenTamu.java
* Deskripsi    : berisi atribut dan method dalam class DosenTamu
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    /* Atribut */
    private String NIDK;
    private int kontrakKerja;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public DosenTamu() {
        
    }
    
    // Konstruktor dengan parameter
    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas, String NIDK, int kontrakKerja) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.kontrakKerja = kontrakKerja;
    }

    /* Mutator */
    // Mengubah nilai kontrak Kerja
    public void setKontrakKerja(int kontrakKerja) {
        this.kontrakKerja = kontrakKerja;
    }

    /* Selektor */
    // Menampilkan NIDK
    public String getNIDK() {
        return NIDK;
    }

    // Menampilkan bulan kontrakKerja
    public int getKontrakKerja() {
        return kontrakKerja;
    }

    // Menghitung waktu berakhir kontak (Tanggal masuk + kontrakKerja)
    public LocalDate getAkhirKontrak() {
        return TMT.plusMonths(kontrakKerja);
    }

    // Menghitung tunjangan (2.5% * gaji pokok)
    public double gethitungtunjangan() {
        return 0.025 * getgajiPokok();
    }

    // Menampilkan detail Dosen Tamu
    @Override
    public void printInfo() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy"); 
    super.printInfo();
        System.out.println("NIDK          : " + NIDK);
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Durasi Kontrak: " + kontrakKerja + " bulan");
        System.out.println("AkhirKontrak  : " + getAkhirKontrak().format(formatter));
        System.out.println("Tunjangan     : 2,5%  x " + 
                            String.format("%,.2f", getgajiPokok()) + " = Rp " + 
                            String.format("%,.2f", gethitungtunjangan()));
    }
}
