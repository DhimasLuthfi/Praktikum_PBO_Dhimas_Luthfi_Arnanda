
public class Pegawai {
    /* Attribut */
    protected String nama;
    protected static int gajiPokok = 5000000;
    /* Method */
    public Pegawai() {

    }
    public Pegawai(String nama) {
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}
