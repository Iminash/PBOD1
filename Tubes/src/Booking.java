/**
 * File         : Booking.java
 * Deskripsi    : Kelas transaksi reservasi yang mengelola kamar
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

import java.util.ArrayList;
import java.util.List;

public class Booking {
    /* Atribut */
    private Guest guest;
    private List<Room> rooms = new ArrayList<>();
    private int nights;
    /* Method */
    public Booking(Guest guest, int nights) {
        this.guest = guest;
        this.nights = nights;
    }

    // Overloading
    public void addRoom(Room r) throws BookingException {
        if (!r.getIsAvailable()) throw new BookingException("Kamar " + r.getRoomId() + " sudah terisi!");
        rooms.add(r);
        r.setAvailability(false);
    }

    // Overloading
    public void addRoom(List<Room> roomList) throws BookingException {
        for (Room r : roomList) addRoom(r);
    }

    public double calculateTotal() {
        double total = 0;
        for (Room r : rooms) total += r.calculatePrice(nights);
        return total;
    }
}