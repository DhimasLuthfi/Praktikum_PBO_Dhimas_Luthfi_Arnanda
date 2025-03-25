/* 
 * Responsi PBO 1
 * Nama File    : Main.java
 * Deskripsi    : berisi implementasi dari seluruh class
 * Pembuat      : Dhimas Luthfi Arnanda
 * Tanggal      : 25 Maret 2025
 */
public class main {
    public static void main(String[] args) {
        // membuat objek fakultas
        Fakultas informatika = new Fakultas("Informatika", 8500000, 9500000);
        Fakultas kedokteran = new Fakultas("Kedokteran", 15000000, 12000000);
        Fakultas psikologi = new Fakultas("Psikologi", 10000000, 8500000);

        // mmembuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Bedu Cris", "bedu@univ.ac.id", "24060100100001", 8, informatika);
        Mahasiswa mhs2 = new Mahasiswa("Siti Aisyah", "aisyah@univ.ac.id", "2131200200002", 4, kedokteran);
        Mahasiswa mhs3 = new Mahasiswa("Rafli Nanda", "rafli@univ.ac.id", "20891300300003", 1, psikologi);
        Mahasiswa mhs4 = new Mahasiswa("Laras Puspita", "laras@univ.ac.id", "23721100400004", 3, informatika);
        
        // membuat objek dosen
        Dosen dosen1 = new Dosen("Prof. Dr. Bambang Suprapto", "bambang@univ.ac.id", "197501001000000001", 25, informatika);
        Dosen dosen2 = new Dosen("Dr. Maya Indraswari", "maya@univ.ac.id", "198802002000000002", 15, kedokteran);
        Dosen dosen3 = new Dosen("Dr. Arif Rahman", "arif@univ.ac.id", "199003003000000003", 10, psikologi);

        // membuat objek tendik
        Tendik tendik1 = new Tendik("Agus Supriyanto", "agus@univ.ac.id", "196501001000000004", 30);
        Tendik tendik2 = new Tendik("Dewi Ayu", "dewi@univ.ac.id", "197802002000000005", 22);
        Tendik tendik3 = new Tendik("Fajar Setiawan", "fajar@univ.ac.id", "198503003000000006", 18);


        System.out.println("========= Mahasiswa ==========");
        System.out.println("- Mahasiswa 1 -");
        mhs1.printInfo();
        System.out.println("- Mahasiswa 2 -");
        mhs2.printInfo();
        System.out.println("- Mahasiswa 3 -");
        mhs3.printInfo();
        System.out.println("- Mahasiswa 4 -");
        mhs4.printInfo();
        
        System.out.println("========== Dosen ==========");
        System.out.println("- Dosen 1 -");
        dosen1.printInfo();
        System.out.println("- Dosen 2 -");
        dosen2.printInfo();
        System.out.println("- Dosen 3 -");
        dosen3.printInfo();
        
        System.out.println("========== Tendik ==========");
        System.out.println("- Tendik 1 -");
        tendik1.printInfo();
        System.out.println("- Tendik 2 -");
        tendik2.printInfo();
        System.out.println("- Tendik 3 -");
        tendik3.printInfo();

        System.out.println("========== Statistika ==========");
        System.out.println("Mahasiswa   : " + Mahasiswa.getcounterMHS());
        System.out.println("Karyawan    : " + Karyawan.getcountKaryawan());
        System.out.println("Dosen       : " + Dosen.getCounterDosen());
        System.out.println("Tendik      : " + Tendik.getcounterTendik());
    }
}