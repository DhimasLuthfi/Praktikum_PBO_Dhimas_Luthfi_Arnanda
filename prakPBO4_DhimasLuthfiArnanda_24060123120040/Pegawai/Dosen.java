/* 
* Nama File    : Dosen.java
* Deskripsi    : berisi atribut dan method dalam class Dosen
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 11 Maret 2025
*/
public class Dosen extends pegawai {
    /* Atribut */
    protected String Fakultas;
    protected static int countDosen = 0;

    /* Method */
    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Dosen() {
        countDosen++;
    }

    // Konstruktor dengan parameter
    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
        countDosen++;
    }

    /* Selektor */
    // Menampilkan Fakultas
    public String getFakultas() {
        return Fakultas;
    }

    // Menampilkan detail dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + Fakultas);
    }


    // Menampilkan Jumlah Dosen
    public static void printCountDosen() {
        System.out.println("Jumlah Dosen   : " + countDosen);
    }
}

