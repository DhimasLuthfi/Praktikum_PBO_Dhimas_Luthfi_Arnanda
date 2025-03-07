/* 
 * File : Asersi.java
 * Deskripsi : Program untuk menunjukan asersi
 * Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
 * Tanggal      : 5 Maret 2025
 */
public class Asersi {
    public static void main(String[] args) {
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0):"ada kesalahan";
            System.out.println("x bilangan negatif");
        }
    }
}
