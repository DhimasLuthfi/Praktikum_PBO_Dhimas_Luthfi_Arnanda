/* 
* Nama File    : Mahasiswa.java
* Deskripsi    : berisi atribut dan method dalam class Mahasiswa
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 19 Februari 2025
*/

import java.util.ArrayList;

public class Mahasiswa {
    /* attribute */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int counterMahasiswa = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter masukan 
    public Mahasiswa() {
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>(); 
        counterMahasiswa++;
    }
    // Konstruktor dengan parameter masukan 
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        this.listMatkul = new ArrayList<>(); 
        counterMahasiswa++;
    }

    /* Selektor */
    // Mengembalikan nilai nim
    public String getNim(){
        return this.nim;
    }
    // Mengembalikan nilai nama
    public String getNama(){
        return this.nama;
    }
    // Mengembalikan nilai prodi
    public String getProdi(){
        return this.prodi;
    }
    // Mengembalikan nilai kendaraan
    public Kendaraan getKendaraan() { 
        return kendaraan;
    }
    // Mengembalikan nilai jumlah sks
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }
    // Mengembalikan nilai jumlahMatKul
    public int getJumlahMatKul() {
        return listMatkul.size();
    }
    // Mengembalikan nilai counterMahasiswa
    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }
    /* Selektor */
    // Mengubah nilai DosenWali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    // Mengubah nilai Kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    // Menambahkan Mata Kuliah
    public void addMatKul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }
    // Menampilkan mahasiswa
    public void printMhs() {
        System.out.println("Mahasiswa: " + nim + " - " + nama + " (" + prodi + ")");
    }
    // menampilkan mata Kuliah
    public void printMatKul(){
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
    }
    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali : ");
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan : ");
            kendaraan.printKendaraan();
        }
        
    }
}
