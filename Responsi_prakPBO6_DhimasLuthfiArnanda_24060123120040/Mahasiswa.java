/* 
* Responsi PBO 1
* Nama File    : Mahasiswa.java
* Deskripsi    : berisi atribut dan method dalam class Mahasiswa
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public class Mahasiswa extends CivitasAkademik {
    /* Attribut */
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMHS = 0;

    /* Method */
    /* Konstruktor */
    public Mahasiswa() {
        counterMHS++;
    }

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMHS++;
    }

    /* Mutator */
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    /* Selektor */
    public String getNim() {
        return nim;
    }

    public int getSemester() {
        return semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public double hitungUKT() {
        return fakultas.gettarifUKT() - (fakultas.gettarifUKT() * 0.05 * (getSemester() - 1));
    }

    @Override
    public void printInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("NIM         : " + getNim());
        System.out.println("Semester    : " + getSemester());
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Biaya UKT   : Rp " + String.format("%,.2f", hitungUKT()));
        System.out.println();
    }

    public static int getcounterMHS() {
        return counterMHS;
    }
}
