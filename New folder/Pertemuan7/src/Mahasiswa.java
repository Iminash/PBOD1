/* File         : Mahasiswa.java
 * Deskripsi    : Nomor 2. POLIMORFISME AD HOC OVERLOADING
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class Mahasiswa {
    /* Atribut */
    private String NIM;
    private String Nama;
    private String Programstudi;

    /* Method */
    // Konstruktor
    // c. Konstruktor tanpa parameter (Default)
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // d. Konstruktor dengan tiga parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // e. Konstruktor dengan satu parameter objek (Kloning)
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    /* Mutator */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Overloading setProgramStudi
    // Varian 1: Tanpa parameter
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    // Varian 2: Satu parameter String
    public void setProgramStudi(String prodi) {
        this.Programstudi = prodi;
    }

    // Varian 3: Satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }

    /* Selektor */
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramstudi() {
        return Programstudi;
    }

    // Method Lainnya
    public void printInfo() {
        System.out.println("NIM: " + NIM + ", Nama: " + Nama + ", Prodi: " + Programstudi);
    }
}