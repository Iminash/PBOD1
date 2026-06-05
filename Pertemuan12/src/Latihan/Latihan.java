/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;

import java.util.HashMap;
import java.util.Map;

/**
 * File      : Pertemuan12.java
 * Deskripsi : Program menampilkan key (NIM) dan value (Nama) dari Map menggunakan ekspresi lambda.
 */

/**
 *
 * @author imina
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat koleksi Map dengan Key bertipe String (NIM) dan Value bertipe String (Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Memasukkan data ke dalam Map
        mahasiswaMap.put("24060124130001", "Andi Suryo");
        mahasiswaMap.put("24060124130002", "Budi Santoso");
        mahasiswaMap.put("24060124130003", "Citra Kirana");
        mahasiswaMap.put("24060124130004", "Dewi Lestari");

        System.out.println("Daftar Mahasiswa:");
        
        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        // Parameter lambda pada Map menerima dua argumen: (key, value)
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}
