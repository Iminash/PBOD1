/* File         : Anabul.java
 * Deskripsi    : Kelas induk untuk simulasi hewan peliharaan
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}