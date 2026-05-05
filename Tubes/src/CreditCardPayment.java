/**
 * File         : CreditCardPayment.java
 * Deskripsi    : Implementasi pembayaran menggunakan kartu kredit (Throw)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class CreditCardPayment implements Payment {
    /* Atribut */
    private String cardNumber;
    private double totalBill;

    /* Method */
    public CreditCardPayment(String cardNumber, double totalBill) {
        this.cardNumber = cardNumber;
        this.totalBill = totalBill;
    }

    @Override
    public void processPayment(double amount) throws BookingException {
        if (amount < totalBill) {
            throw new BookingException("Pembayaran Gagal: Dana tidak mencukupi!");
        }
        System.out.println("Pembayaran Berhasil via Kartu Kredit: " + cardNumber);
    }
}