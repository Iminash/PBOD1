/* File         : Anabul.java
 * Deskripsi    : Nomor 3. POLIMORFISME UNIVERSAL INCLUSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public abstract class Anabul {
    /* Atribut */
    protected String nama;

    /* Method */
    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }

    // Method Lainnya
    public abstract void Gerak();
    public abstract void Bersuara();
}