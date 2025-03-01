/* 
* Nama File    : Mmain.java
* Deskripsi    : berisi aplikasi dari class mahasiswa, dosen, matkul, dan kendaraan
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Februari 2025
*/
public class Mmain {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("D001", "Dr. Budi", "Ilmu Komputer");
        Dosen dosen2 = new Dosen("D002", "Dr. Ahmad", "Sistem Informasi");
        Dosen dosen3 = new Dosen("D003", "Dr. Candra", "Teknik Informatika");
        
        // Membuat objek mata kuliah
        MataKuliah matkul1 = new MataKuliah("MK001", "Pemrograman Lanjut", 3);
        MataKuliah matkul2 = new MataKuliah("MK002", "Management Project", 4);
        MataKuliah matkul3 = new MataKuliah("MK003", "Sistem Cerdas", 2);

        // Membuat kendaraan
        Kendaraan kendaraan1 = new Kendaraan("H1234AG", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("G1324AA", "Motor");
        Kendaraan kendaraan3 = new Kendaraan();
        Kendaraan kendaraan4 = new Kendaraan("AA3452D", "Sepeda");
        
        // membuat objek mahasiswa
        System.out.println("========== Mahasiswa 1 ==========");
        Mahasiswa mhs1 = new Mahasiswa("A11.2020.1234", "Ahmad Rafi", "Informatika", dosen1, kendaraan1);
        mhs1.addMatKul(matkul3);
        mhs1.addMatKul(matkul2);
        mhs1.setKendaraan(kendaraan3);
        mhs1.printDetailMhs();
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getCounterMahasiswa());
        
        System.out.println("\n========== Mahasiswa 2 ==========");
        Mahasiswa mhs2 = new Mahasiswa("A12.2022.1345", "Putri carmen", "Biologi", dosen2, kendaraan2);
        System.out.println("Nama Mahasiswa : " + mhs1.getNama());
        System.out.println("NIM Mahasiswa : " + mhs1.getNim());
        System.out.println("Jenis kendaraan : " + mhs1.getKendaraan().getjenis());
        mhs2.addMatKul(matkul1);
        mhs2.addMatKul(matkul2);
        mhs2.addMatKul(matkul3);
        System.out.println("Mata Kuliah : ");
        mhs2.printMatKul();
        System.out.println("Jumlah Mata Kuliah : " + mhs2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah : " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getCounterMahasiswa());
        
        System.out.println("\n========== Mahasiswa 3 ==========");
        Mahasiswa mhs3 = new Mahasiswa("A22.2024.3211", "Budiansyah", "Teknik Mesin", dosen3, kendaraan3);
        mhs3.printDetailMhs();
        System.out.println("-- melakukan aksi penambahan dan set --");
        mhs3.addMatKul(matkul3);
        mhs3.setKendaraan(kendaraan4);
        System.out.println("Kendaraan : " + mhs3.getKendaraan().getjenis());
        System.out.println("Jumlah Mata Kuliah : " + mhs3.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah : " + mhs3.getJumlahSKS());
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getCounterMahasiswa());
        



    }
}
