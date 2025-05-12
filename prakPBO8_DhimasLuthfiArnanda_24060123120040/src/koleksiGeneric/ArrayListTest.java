
package koleksiGeneric;

/*
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : ArrayListTest.java
 * Deskripsi    : Program penggunaan objek ArrayList Sebagai collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        // Inisialisasi ArrayList yang hanya dapat berisikan objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambahkan elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus objek
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s+" ");
        }
    }
}
