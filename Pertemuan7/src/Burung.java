/* File         : Burung.java
 * Deskripsi    : Nomor 3. POLIMORFISME UNIVERSAL INCLUSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class Burung extends Anabul {
    /* Method */
    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // Method Lainnya
    @Override
    public void Gerak() {
        System.out.println(nama + "terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}