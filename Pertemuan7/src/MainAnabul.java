/* File         : MainAnabul.java
 * Deskripsi    : Nomor 3. POLIMORFISME UNIVERSAL INCLUSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class MainAnabul {
    /* Method */
    public static void main(String[] args) {
        Anabul[] daftarAnabul = new Anabul[3];
        daftarAnabul[0] = new Kucing("Cat");
        daftarAnabul[1] = new Anjing("Dog");
        daftarAnabul[2] = new Burung("Birb");
        for (Anabul anabul : daftarAnabul) {
            System.out.println("Nama Anabul: " + anabul.getNama());
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println();
        }
    }
}