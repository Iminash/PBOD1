/* File         : Kucing.java
 * Deskripsi    : Kelas turunan Anabul dengan penambahan atribut bobot
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Kucing extends Anabul {
    /* Atribut */
    protected double bobot; // bobot dalam kilogram

    /* Method */
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }
}