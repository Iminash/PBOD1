/* File         : Kucing.java
 * Deskripsi    : Kelas turunan Kucing
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Kucing extends Anabul {
    /* Atribut */
    protected double bobot;

    /* Method */
    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }
}

// hierarki
class Anggora extends Kucing {
    public Anggora(String panggilan, double bobot) { super(panggilan, bobot); }
}

class Anjing extends Anabul {
    public Anjing(String panggilan) { super(panggilan); }
}