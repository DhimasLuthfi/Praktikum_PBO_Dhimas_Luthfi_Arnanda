/* 
* Nama File    : Dosen.java
* Deskripsi    : berisi aplikasi dalam class Inheritance pegawai
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
public class MLatihan {
    public static void main(String[] args) {
        
        System.out.println("\n=== Objek Pegawai ===");
        pegawai P1 = new pegawai("8720847152", "Budi Santoso", "1985-04-12", "2013-07-01", 5000000);
        P1.printInfo();
        
        System.out.println("\n=== Objek Dosen ===");
        Dosen d1 = new Dosen("8765672548", "Siti Rahmawati", "1978-08-22", "2017-09-15", 7000000, "Fakultas Teknik");
        d1.printInfo();
        
        System.out.println("\n=== Objek Dosen Tetap ===");
        DosenTetap dTetap1 = new DosenTetap("9545647548", "Hamzah Erza", "1993-07-09", "2018-11-03", 8500000, "Fakultas Teknik Mesin", "78647324");
        dTetap1.printInfo();
        
        System.out.println("\n=== Objek Dosen Tamu ===");
        DosenTamu dTamu1 = new DosenTamu("9585624376", "Murodi Anwar", "1997-03-21", "2022-06-21", 1500000, "Fakultas Informatika", "76539876", 8);
        dTamu1.printInfo();
        
        System.out.println("\n=== Objek Dosen Tendik ===");
        Tendik T1 = new Tendik("9585624376", "Murodi Anwar", "1989-04-11", "2019-10-14", 3650000, "Kemahasiswaan");
        T1.printInfo();


        System.out.println("\n=== Statistik ===");
        pegawai.printCountPegawai();
        Dosen.printCountDosen();
        Tendik.printCountTendik();
    }
}
