
package koleksiGeneric;

/**
 * Nama : Dhimas Luthfi Arnanda
 * NIM  : 24060123120040
 * Lab  : PBO B2
 * Tgl  : 8 Mei 2025
 */

/**
 * File         : Maptest.java
 * Deskripsi    : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Satu");
        map.put(2, "Dua");

        // Mengambil elemen pertama
        System.out.println("Elemen pertama: " + map.get(1));

        // Mengambil keseluruhan elemen
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
