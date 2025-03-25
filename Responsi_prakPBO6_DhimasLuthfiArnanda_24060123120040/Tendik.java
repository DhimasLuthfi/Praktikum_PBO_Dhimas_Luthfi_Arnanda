/* 
* Responsi PBO 1
* Nama File    : Tendik.java
* Deskripsi    : berisi atribut dan method dalam class Tendik
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public class Tendik  extends Karyawan{
    /* Attribut */
    private static double gajiPokokTendik = 4000000;
    private static int counterTendik = 0;

    /* Method */
    /* Konstruktor */
    public Tendik() {
        counterTendik++;
    }

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }

    /* Mutator */
    /* Selektor */
    public double getgajiPokokTendik() {
        return gajiPokokTendik;
    }

    @Override
    public double hitungGaji() {
        return getgajiPokokTendik() + (getMasaKerja() * 0.01 * getgajiPokokTendik());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji        : Rp " + String.format("%,.2f", hitungGaji()));
        System.out.println();
    }

    public static int getcounterTendik() {
        return counterTendik;
    }
}
