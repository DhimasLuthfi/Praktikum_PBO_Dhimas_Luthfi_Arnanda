/* 
* Responsi PBO 1
* Nama File    : CivitasAkademik.java
* Deskripsi    : berisi atribut dan method dalam class abstrac CivitasAkademik
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Maret 2025
*/
public abstract class CivitasAkademik {
    protected  String nama;
    protected  String email;
    private static int countCivitAkademik = 0;

    /* Method */
    /* Konstruktor */
    public CivitasAkademik() {
        countCivitAkademik++;
    }

    public CivitasAkademik(String nama, String email) {
        this.nama = nama;
        this.email = email;
        countCivitAkademik++;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public static int getTotalCivitas() {
        return countCivitAkademik;
    }

    public abstract void printInfo();
}
