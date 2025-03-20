/* 
* Nama File    : Mmain.java
* Deskripsi    : berisi aplikasi dalam class Inheritance BangunDatar
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
public class Mmain {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(12, "merah", "putih");
        Persegi P2 = new Persegi(4, "hijau", "biru");
        BangunDatar L1 = new Lingkaran(6, "hitam", "putih");
        Lingkaran L2= new Lingkaran (9, "ungu", "hitam");
        System.out.println("========= Membuat Objek Lingkaran =========");
        L2.printInfo();
        System.out.println("--L2.zoomIn--");
        L2.zoomIn();
        System.out.println("Jari-Jari   : " + L2.getJari());
        System.out.println("========== Membuat Objek Persegi ==========");
        P2.printInfo();
        System.out.println("--P2.zoom(10)--");
        P2.zoom(10);
        System.out.println("Sisi   : " + P2.getSisi());

        System.out.println("IsEqualLuas P2--P1 : " + P2.isEqualLuas(P1));
        System.out.println("IsEqualLuas L2--L1 : " + L1.isEqualLuas(L2));



        
        // System.out.println("======= Membuat Objek Bangun Datar =======");
        // BangunDatar B1 = new BangunDatar();
        // B1.setJmlSisi(3);
        // B1.setBorder("Hitam");
        // B1.setWarna("Putih");
        // B1.printInfo();
        // BangunDatar.printCounterBangunDatar();

        // System.out.println("========== Membuat Objek Persegi ==========");
        // System.out.println("Persegi P1:");
        // Persegi P1 = new Persegi(8, "Merah", "Putih" );
        // P1.setBorder("Biru");
        // P1.printInfo();
        // System.out.println("Diagonal: " + P1.getDiagonal());
        // System.out.println("Keliling: " + P1.getKeliling());
        // System.out.println("Luas: " + P1.getLuas());
        // BangunDatar.printCounterBangunDatar();

        // System.out.println("========= Membuat Objek Lingkaran =========");
        // System.out.println("Lingkaran L1:");
        // Lingkaran L1 = new Lingkaran(8, "Merah", "Putih" );
        // L1.setBorder("Biru");
        // L1.setJari(6);
        // L1.printInfo();
        // System.out.println("Jari-jari: " + L1.getJari());
        // System.out.println("Keliling: " + L1.getKeliling());
        // System.out.println("Luas: " + L1.getLuas());
        // BangunDatar.printCounterBangunDatar();

    }
}
