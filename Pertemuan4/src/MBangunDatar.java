/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 10/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(4, "Merah", "idk what this mean");
        Lingkaran L1 = new Lingkaran(14, "Biru", "me too");
        P1.setWarna("Hijau");
        P2.printInfo();
        L1.printInfo();
    }
}
