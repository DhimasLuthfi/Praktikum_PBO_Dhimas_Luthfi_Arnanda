public class Programmer extends Pegawai{
    /* Attribut */
    private static int Bonus = 450000;
    /* Method */
    public Programmer() {

    }
    public Programmer(String nama) {
        super(nama);
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + Bonus);
    }
}