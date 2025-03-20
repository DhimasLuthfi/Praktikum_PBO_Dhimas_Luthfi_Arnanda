/* 
* Nama File    : MManusia.java
* Deskripsi    : berisi Aplikasi dari class Pengusaha, PNS, dan Petani
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) { 
        
        // Membuat objek PNS, Pengusaha, dan Petani
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002"); 
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl.Air", 55000000, "000-556-773-212-000-5"); 
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri"); 
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "", 10000000, "198004212010041002"); 

        System.out.println("================= PNS p2 ==================");
        System.out.println("Alamat p2 sebelum   : " + p2.getAlamat());
        p2.setAlamat("Jl. Panorama 111 Tembalang"); 
        System.out.println("Alamat p2 sesudah   : " + p2.getAlamat());
        
        System.out.println("===== Menampilkan Jumlah instansiasi =====");
        System.out.println("Jumlah Manusia      : " + Manusia.getCounterManusia()); 
        System.out.println("Jumlah PNS          : " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha    : " + Pengusaha.getCounterPenguasaha()); 
        System.out.println("Jumlah Petani       : " + Petani.getCounterPetani()); 
        
        System.out.println("======== Menampilkan Jumlah Pajak ========");
        System.out.println("Pajak PNS p1        : Rp " + String.format("%,.2f", p1.hitungPajak()));
        System.out.println("Pajak PNS p2        : Rp " + String.format("%,.2f", p2.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 : Rp " + String.format("%,.2f", pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1    : Rp " + String.format("%,.2f", pt1.hitungPajak()));
        
        System.out.println("========= Menampilkan masa Kerja =========");
        // Menampilkan masa kerja setiap objek
        System.out.println("Masa Kerja p1       : " + (p1.hitungMasaKerja()/12) + " tahun " + (p1.hitungMasaKerja()%12) + " bulan"); 
        System.out.println("Masa Kerja p2       : " + (p2.hitungMasaKerja()/12) + " tahun " + (p2.hitungMasaKerja()%12) + " bulan"); 
        System.out.println("Masa Kerja pe1      : " + (pe1.hitungMasaKerja()/12) + " tahun " + (pe1.hitungMasaKerja()%12) + " bulan"); 
        System.out.println("Masa Kerja pt1      : " + (pt1.hitungMasaKerja()/12) + " tahun " + (pt1.hitungMasaKerja()%12) + " bulan"); 
        
        System.out.println("====== Menampilkan detail informasi ======");
        System.out.println("---PNS p1---");
        p1.printInfo(); 
        System.out.println("---PNS p2---");
        p2.printInfo(); 
        System.out.println("---Pengusaha pe1---");
        pe1.printInfo(); 
        System.out.println("---Petani pt1---");
        pt1.printInfo();
    }
}
