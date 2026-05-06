/* File         : Anabul.java
 * Deskripsi    : Kelas induk Anabul
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public abstract class Anabul {
    /* Atribut */
    protected String panggilan;

    /* Method */
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }
}