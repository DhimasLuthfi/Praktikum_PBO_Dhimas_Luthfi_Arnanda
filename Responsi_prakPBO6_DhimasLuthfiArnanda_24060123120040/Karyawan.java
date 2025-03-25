/* 
* Responsi PBO 1
* Nama File    : Karyawan.java
* Deskripsi    : berisi atribut dan method dalam class abstrac Karyawan
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public abstract class Karyawan extends CivitasAkademik {
    /* Attribut */
    private String NIP;
    private int masaKerja;
    private static int countKaryawan = 0;
    
    /* Method */
    /* Konstruktor */
    public Karyawan() {
        countKaryawan++;
    }

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
        countKaryawan++;
    }

    /* Mutator */
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    /* Selektor */
    public String getNIP() {
        return NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    @Override
    public void printInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("NIP         : " + getNIP());
        System.out.println("Masa Kerja  : " + (getMasaKerja()/12) + " tahun " + (getMasaKerja()%12) + " bulan");
    }
    
    public static int getcountKaryawan() {
        return countKaryawan;
    }

    public abstract double hitungGaji();
}
