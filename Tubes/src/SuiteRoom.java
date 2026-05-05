/**
 * File         : SuiteRoom.java
 * Deskripsi    : Kelas kamar mewah dengan biaya layanan tambahan 30% (Overriding)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class SuiteRoom extends Room {
    /* Atribut */
    /* Method */
    public SuiteRoom(String roomId, double basePrice) {
        super(roomId, basePrice);
    }

    @Override
    public double calculatePrice(int nights) {
        return (basePrice * nights) * 1.30;
    }
}