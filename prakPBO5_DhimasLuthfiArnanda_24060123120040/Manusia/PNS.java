/* 
* Nama File    : PNS.java
* Deskripsi    : berisi atribut dan method dalam class PNS
* Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
* Tanggal      : 18 Maret 2025
*/

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak{
    /* Attribut */
    private String nip;
    private static int counterPNS = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor PNS tanpa parameter
    public PNS() {
        counterPNS++;
    }

    // Konstruktor PNS dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /* Selektor */
    public String getNip() {
        return nip;
    }

    // Menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int tahun = (now.getYear() - tgl_mulai_kerja.getYear()) * 12;
        int bulan = now.getMonthValue() - tgl_mulai_kerja.getMonthValue();
        return tahun + bulan + 0; // NIM[14] = 0
    }

    // Menghitung pajak PNS
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    // Menampilkan Detail PNS
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP                 : " + nip);
        System.out.println("Pajak               : Rp " + String.format("%,.2f", hitungPajak()));
    }

    // menampilkan jumlah PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

}
