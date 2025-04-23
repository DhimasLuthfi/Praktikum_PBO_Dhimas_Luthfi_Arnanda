public class Manajer extends Pegawai {
    /* Attribut */
    private static int tunjangan = 700000;
    /* Method */
    public Manajer() {

    }
    public Manajer(String nama) {
        super(nama);
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}