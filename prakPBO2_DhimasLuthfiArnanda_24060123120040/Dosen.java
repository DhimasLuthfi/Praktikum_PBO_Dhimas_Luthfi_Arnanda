/* 
* Nama File    : Dosen.java
* Deskripsi    : berisi atribut dan method dalam class Dosen
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Februari 2025
*/
public class Dosen {
    //Attribute
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;

    /*Konstruktor */
    // Konstruktor tanpa parameter masukan
    public Dosen(){
        nip = " ";
        nama = " ";
        prodi = " ";
        counterDosen++;
    }
    // Konstruktor dengan parameter masukan 
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }
    /* Selektor */
    // Mengembalikan nilai nip
    public String getNip(){
        return nip;
    }
    // Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }
    // Mengembalikan nilai prodi
    public String getProdi(){
        return prodi;
    }
    // Mengembalikan nilai counterDosen
    public static int getCounterDosen() {
        return counterDosen;
    }
    /* Mutator */
    // Mengubah nilai nip
    public void setNip (String nip){
        this.nip = nip;
    }
    // Mengubah nilai nama
    public void setNama (String nama){
        this.nama = nama;
    }
    // Mengubah nilai prodi
    public void setProdi (String prodi){
        this.prodi = prodi;
    }
    // Menampilkan dosen
    public void printDosen() {
        System.out.println("(" + getNip() + ") - " + getNama() + " - " + getProdi() + ")");
    }
}
