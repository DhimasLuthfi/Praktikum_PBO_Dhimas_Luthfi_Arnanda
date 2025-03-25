/* 
* Responsi PBO 1
* Nama File    : Dosen.java
* Deskripsi    : berisi atribut dan method dalam class Dosen
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public class Dosen extends Karyawan {
    /* Attribut */
    private Fakultas fakultas;
    private static int counterDosen = 0;

    /* Methof */
    /* Konstruktor */
    public Dosen() {
        counterDosen++;
    }

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    /* Mutator */
    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    /* Selektor */
    public Fakultas getFakultas() {
        return fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Gaji        : Rp " + String.format("%,.2f", hitungGaji()));
        System.out.println();
    }

    public static int getCounterDosen() {
        return counterDosen;
    }
}
