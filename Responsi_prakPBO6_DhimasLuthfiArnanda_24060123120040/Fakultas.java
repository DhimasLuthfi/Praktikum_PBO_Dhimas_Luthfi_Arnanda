/* 
* Responsi PBO 1
* Nama File    : Fakultas.java
* Deskripsi    : berisi atribut dan method dalam class Fakultas
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public class Fakultas {
    /* Attribut */
    private String nama;
    private double tarifUKT;
    private double gajiPokok;
    // private static int counterFakultas = 0;

    /* Method */
    /* Konstruktor */
    public Fakultas(){
        
    }
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }

    public double gettarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setgajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void setTarifUKT(double tarifUkT) {
        this.tarifUKT = tarifUkT;
    }

    public void printInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Tarif UKS   : " + gettarifUKT());
        System.out.println("Gaji Pokok  : " + getGajiPokok());
    }

    // public static int getCounterFakultas() {
    //     return counterFakultas;
    // }

}
