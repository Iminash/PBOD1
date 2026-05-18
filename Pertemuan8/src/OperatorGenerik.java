/* File         : OperatorGenerik.java
 * Deskripsi    : Kelas yang berisi prosedur dan fungsi generik (Bounded & Unbounded)
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class OperatorGenerik {
    /* Method */
    
    // a. Prosedur Tukar dengan parameter generik
    // Menggunakan Datum sebagai wrapper karena Java adalah pass-by-value
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // c. Fungsi Bobot2 dengan Upper Bounded Generic (T extends Kucing)
    public <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}