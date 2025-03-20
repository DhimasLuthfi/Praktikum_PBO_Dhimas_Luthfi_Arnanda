/* 
* Nama File    : IResize.java
* Deskripsi    : berisi method dari interface IResize
* Pembuat      : Dhimas Luthfi Arnanda
* Tanggal      : 18 Maret 2025
*/
public interface IResize {
    // menambahkan ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    public void zoom(int percent);
}
