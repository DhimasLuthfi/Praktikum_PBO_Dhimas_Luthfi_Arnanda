/* 
 * File : ExceptionOnArray.java
 * Deskripsi : Program oenggunaan eksepsi menggunakan class library java
 * Pembuat      : Dhimas Luthfi Arnanda - 24060123120040
 * Tanggal      : 5 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
