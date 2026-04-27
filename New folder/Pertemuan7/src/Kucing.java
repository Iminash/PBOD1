/* File         : Kucing.java
 * Deskripsi    : Nomor 3. POLIMORFISME UNIVERSAL INCLUSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class Kucing extends Anabul {
    /* Method */
    // Konstruktor
    public Kucing(String nama) {
        super(nama);
    }

    // Method Lainnya
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " meong.");
    }
}