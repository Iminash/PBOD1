/* File         : Teman.java
 * Deskripsi    : Kelas untuk mengelola koleksi
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

import java.util.List;
import java.util.ArrayList;

public class Teman {
    /* Atribut */
    private int nbelm;
    private List<String> Lnama;

    /* Method */
    // Konstruktor
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a. getNbelm
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    // c. setNama(indeks, nama)
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // d. addNama(nama)
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama)
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
            System.out.println(nama + " berhasil dihapus.");
        } else {
            System.out.println(nama + " tidak ditemukan.");
        }
    }

    // f. isMember(nama)
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namabaru)
    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        } else {
            System.out.println("Nama " + nama + " tidak ditemukan.");
        }
    }

    // h. countNama(nama)
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}