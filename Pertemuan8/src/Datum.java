/* File         : Datum.java
 * Deskripsi    : Kelas generik untuk membungkus sebuah nilai/objek
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Datum<T> {
    /* Atribut */
    private T isi;

    /* Method */
    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}