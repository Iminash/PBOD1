/* File         : MainMahasiswa.java
 * Deskripsi    : Nomor 2. POLIMORFISME AD HOC OVERLOADING
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class MainMahasiswa {
    /* Method */
    public static void main(String[] args) {
        // b, c, d, e. Pengujian Aplikasi Konstruktor dan Operator
        System.out.println("--- Pengujian Konstruktor ---");
        // Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        // Konstruktor 3 parameter
        Mahasiswa m2 = new Mahasiswa("240601241", "Kamal", "Informatika");
        // Konstruktor kloning
        Mahasiswa m3 = new Mahasiswa(m2);
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        
        // Varian 1
        m1.setProgramStudi();
        System.out.print("Varian 1: ");
        m1.printInfo();

        // Varian 2
        m1.setProgramStudi("Sistem Informasi");
        System.out.print("Varian 2: ");
        m1.printInfo();

        // Varian 3
        Mahasiswa m_ref = new Mahasiswa("000", "Reference", "Biologi");
        m1.setProgramStudi(m_ref);
        System.out.print("Varian 3: ");
        m1.printInfo();
    }
}