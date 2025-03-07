/* 
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
 * Tanggal      : 5 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
