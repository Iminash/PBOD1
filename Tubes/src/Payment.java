/**
 * File         : Payment.java
 * Deskripsi    : Interface kontrak untuk berbagai metode pembayaran (Throws)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public interface Payment {
    void processPayment(double amount) throws BookingException;
}