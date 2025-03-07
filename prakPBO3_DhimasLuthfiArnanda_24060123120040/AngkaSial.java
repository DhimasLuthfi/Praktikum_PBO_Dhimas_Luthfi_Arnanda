/* 
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa throw dan throws
 * Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
 * Tanggal      : 5 Maret 2025
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati masukkan angka!!!");
        }
    }
}

/*
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
 *  
 * kode pada baris 12 tersebut tidak akan dieksekusi. Ketika eksepsi terjadi yaitu pada saat
 * angka == 13, maka program akan langsung melempar AngkaSialException dengan throw new AngkaSialException();
 * Setelah  eksepsi program akan dilempar dan ditangkap oleh blok catch yang sesuai, program akan mengeksekusi 
 * semua pernyataan di dalam blok catch, kemudian program akan berhenti sehingga baris 12 tidak akan pernah 
 * dieksekusi.
 * 
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
 * 
 * kode pada baris 21 akan dieksekusi saat eksepsi terjadi. Ketika eksepsi terjadi, program akan dilemparkan oleh 
 * throw new AngkaSialException(); dan akan ditangkap oleh blok catch dan mengeksekusi semua pernyataan di dalam 
 * blok catch termasuk System.out.println(ase.getMessage()); dan System.out.println("hati-hati masukkan angka!!!");
 * kemudian program akan berhenti.
 * 
 */
