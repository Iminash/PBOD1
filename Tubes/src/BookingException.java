/**
 * File         : BookingException.java
 * Deskripsi    : Kelas eksepsi kustom untuk menangani kesalahan proses reservasi
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class BookingException extends Exception {
    public BookingException(String message) {
        super(message);
    }
}