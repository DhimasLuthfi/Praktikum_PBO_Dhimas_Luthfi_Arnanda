
package latihanVeryEasy;

/*
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public String getBunyi() {
        return this.bunyi;
    }
    
    public int getPeluru() {
        return this.peluru;
    }
    
    public void menembak() {
        this.peluru -= 1;
        System.out.println(this.bunyi);
        System.out.println("Sisa Peluru: " + this.peluru);
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
