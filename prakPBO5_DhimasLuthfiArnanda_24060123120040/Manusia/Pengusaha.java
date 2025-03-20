/* 
* Nama File    : Pengusaha.java
* Deskripsi    : berisi atribut dan method dalam class Pengusaha
* Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
* Tanggal      : 18 Maret 2025
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /* Attribut */
    private String npwp;
    private static int counterPengusaha;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Pengusaha() {
        counterPengusaha++;
    }

    /* Selektor */
    // Menampilkan npwp
    public String getNpwp() {
        return npwp;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }


    // Menghitung masa kerja Penguasaha
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int tahun = (now.getYear() - tgl_mulai_kerja.getYear()) * 12;
        int bulan = now.getMonthValue() - tgl_mulai_kerja.getMonthValue();
        return tahun + bulan + 4; // NIM[13] = 4
    }

    // Menghitung pajak Penguasaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // menampilkan detail pengusaha
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NPWP                : " + npwp);
        System.out.println("Pajak               : Rp " + String.format("%,.2f", hitungPajak()));
    }

    // menampilkan jumlah PNS
    public static int getCounterPenguasaha() {
        return counterPengusaha;
    }
}
