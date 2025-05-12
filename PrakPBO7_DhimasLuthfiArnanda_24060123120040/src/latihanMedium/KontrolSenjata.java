
package latihanMedium;

/*
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 1 Mei 2025
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public int isiPeluru(int jumPeluru) {
        int total = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(total);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
        return total;
    }
    
    public int menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        int total = 0;
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        }
        else {
            for(int i = 0; i < jumlah; i++) {
                if(isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                    total += 1;
                }
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
        }
        
        if(total != 0){
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
        return total;
    }
    
    public void menusuk(){
        if (senjata.isMenusuk()){
            System.out.println("Jleb! ");
        } else {
            System.out.println("Gagal, belum pasang bayonet");
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
