/* 
* Nama File    : Petani.java
* Deskripsi    : berisi atribut dan method dalam class Petani
* Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
* Tanggal      : 18 Maret 2025
*/

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak{
    /* Attribut */
    private String asalKota;
    private static int counterPetani;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Petani() {
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    /* Mutator */
    // Mengubah nilai asal kota
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    /* Selektor */
    // Menampilkan asal kota petani
    public String getAsalKota() {
        return asalKota;
    }

    // Menghitung pajak Petani
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Menghitung masa kerja Petani
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int tahun = (now.getYear() - tgl_mulai_kerja.getYear()) * 12;
        int bulan = now.getMonthValue() - tgl_mulai_kerja.getMonthValue();
        return tahun + bulan + 0; // NIM[12] = 0
    }

    // menampilkan detail petani
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Asal Kota           : " + asalKota);
        System.out.println("Pajak               : Rp " + String.format("%,.2f", hitungPajak())+ " (Petani tidak dikenakan pajak)");
    }

    // menampilkan jumlah petani
    public static int getCounterPetani() {
        return counterPetani;
    }
}
