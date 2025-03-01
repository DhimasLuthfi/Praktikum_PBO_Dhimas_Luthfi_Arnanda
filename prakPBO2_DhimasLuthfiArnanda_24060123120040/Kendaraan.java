/* 
* Nama File    : Kendaraan.java
* Deskripsi    : berisi atribut dan method dalam class Kendaraan
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 25 Februari 2025
*/
public class Kendaraan {
    //Attribute
    private String noPlat;
    private String jenis;
    private static int counterKendaraan = 0;

    /*Konstruktor */
    // konstruktor tanpa parameter masukan
    public Kendaraan(){
        noPlat = " ";
        jenis = " ";
        counterKendaraan++;
    }
    // Konstruktor dengan parameter masukan 
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
        counterKendaraan++;
    }

    /*Mutator */
    // Mengembalikan nilai noPlat
    public String getnoPlat(){
        return noPlat;
    }
    // Mengembalikan nilai jenis
    public String getjenis(){
        return jenis;
    }
    // Mengembalikan nilai countKendaraan
    public static int getCounterkendaraan(){
        return counterKendaraan;
    }

    /*Selektor */
    // Mengubah nilai noPlat
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    // Mengubah nilai jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    // Menampilkan Kendaraan
    public void printKendaraan() {
        System.out.println(getnoPlat() + " - (" + getjenis() + ")");
        
    }
}
