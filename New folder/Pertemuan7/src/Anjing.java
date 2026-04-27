/* File         : Anjing.java
 * Deskripsi    : Nomor 3. POLIMORFISME UNIVERSAL INCLUSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class Anjing extends Anabul {
    /* Method */
    // Konstruktor
    public Anjing(String nama) {
        super(nama);
    }

    // Method Lainnya
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + "guk-guk.");
    }
}