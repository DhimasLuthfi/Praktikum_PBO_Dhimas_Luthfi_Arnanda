    /* Nama File    : Titik.java
    * Deskripsi    : berisi atribut dan method dalam class Titik
    * Pembuat      : Dhimas Luthfi Arnanda
    * Tanggal      : 18 Februari 2025
    */

public class Titik {
    /* States/Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Behavior/Method */
    // Konstruktor
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    public Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }
    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }
    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
    // Mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }
    // Mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }
    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }
    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
    // Menampilkan countertitik
    public void printCounterTitik(){
        System.out.println("Jumlah Objek Titik : " + counterTitik);
    }
    // Mendapatkan kuadran titik
    public int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }
    // Mendapatkan jarak dari titik ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    // Mendapatkan jarak antara titik ini dengan titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // Merefleksikan titik terhadap sumbu X
    public void refleksIX() {
        ordinat = -ordinat;
    }
    // Merefleksikan titik terhadap sumbu Y
    public void refleksIY() {
        absis = -absis;
    }
    // Mendapatkan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }
    // Mendapatkan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }   
}
// end class Titik