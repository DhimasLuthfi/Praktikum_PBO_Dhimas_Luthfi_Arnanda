/* 
 * File : Asersi2.java
 * Deskripsi : Program untuk demo asersi yang akan menolak input jari jari lingkaran yang bernilai nol
 * Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
 * Tanggal      : 5 Maret 2025
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"Jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}


/*
 * secara konsep, ada yang kurang tepat pada program Asersi2 di atas ?
 * 
 * Menurut saya terdapat kesalahan logika pada kode program tersebut. Code assert(jariJari > 0):"Jari jari tidak boleh nol!!"
 * yang ditempatkan setelah melakukan deklarasi variabel jariJari tetapi sebelum objek lingkaran akan menyebabkan asersi
 * hanya memeriksa nilai jariJari yang sudah di deklarasi dengan 0. karena nilai 0 sudah pasti tidak akan valid untuk perhitungan 
 * lingkaran, sehingga pengecekan akan menjadi tidak berguna. Oleh karena itu, sebaiknya memindahkan pengecekan kondisi sebelum 
 * membuat objek Lingkaran dan memastikan nilai jariJari valid sebelum melanjutkan perhitungan.
 */