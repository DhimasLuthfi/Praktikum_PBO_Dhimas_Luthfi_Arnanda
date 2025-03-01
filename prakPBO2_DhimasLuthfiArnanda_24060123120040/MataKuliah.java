/* 
* Nama File    : MataKuliah.java
* Deskripsi    : berisi atribut dan method dalam class MataKuliah
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Februari 2025
*/
public class MataKuliah {
    //Attribute
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatKul = 0;

    /*Konstruktor */
    // Konstruktor tanpa parameter masukan 
    public MataKuliah(){
        idMatKul = " ";
        nama = " ";
        sks = 0;
        counterMatKul++;
    }
    // Konstruktor dengan parameter masukan 
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
        counterMatKul++;
    }

    /*Mutator*/
    // Mengembalikan nilai idMatKul
    public String getidMatKul(){
        return idMatKul;
    }
    // Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }
    // Mengembalikan nilai sks
    public int getSks(){
        return sks;
    }
    // Mengembalikan nilai counterMatKul
    public static int getCounterMatKul() {
        return counterMatKul;
    }

    /*Selektor */
    // Mengubah nilai idMatKul
    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }
    // Mengubah nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }
    // Mengubah nilai sks
    public void setSks(int sks){
        this.sks = sks;
    }
    // Menampilkan MatKul
    public void printMatKul() {
        System.out.println(getidMatKul() + " - " + getNama() + " (" + getSks() + " SKS)");
    }



}
