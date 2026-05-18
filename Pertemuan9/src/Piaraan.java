/* File         : Piaraan.java
 * Deskripsi    : Kelas untuk mengelola antrean Anabul
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /* Atribut */
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /* Method */
    // Konstruktor
    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    // b.i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b.ii. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // b.iii. isMember(anabul)
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // b.iv. getAnabul() - Mengambil data tanpa mengeluarkan dari antrean (Peek)
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // b.v. dequeueAnabul() - Mengambil sekaligus mengeluarkan dari antrean
    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    // c. showAnabul()
    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // d. countKucing()
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing()
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    // f. showJenisAnabul()
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul beserta jenisnya:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (Jenis: " + a.getClass().getSimpleName() + ")");
        }
    }
}