/* Nama File : Dosen.java
 * Deskripsi : Subclass dari Pegawai, merupakan superclass untuk DosenTetap dan DosenTamu.
 * Pembuat   : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal   : 14/03/2026
 */

public class Dosen extends Pegawai {
    /* Atribut */
    protected String fakultas;

    /* Method */
    // Konstruktor
    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    // Method lainnya
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas\t: " + fakultas);
    }
}