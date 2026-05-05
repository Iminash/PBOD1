/**
 * File         : StandardRoom.java
 * Deskripsi    : Kelas kamar standar dengan perhitungan harga normal (Overriding)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class StandardRoom extends Room {
    /* Atribut */
    /* Method */
    public StandardRoom(String roomId, double basePrice) {
        super(roomId, basePrice);
    }

    @Override
    public double calculatePrice(int nights) {
        return basePrice * nights;
    }
}