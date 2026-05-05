/**
 * File         : Room.java
 * Deskripsi    : Kelas abstrak dasar untuk semua jenis kamar hotel
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public abstract class Room {
    /* Atribut */
    protected String roomId;
    protected double basePrice;
    protected boolean isAvailable;

    /* Method */
    public Room() {

    }
    
    public Room(String roomId, double basePrice) {
        assert basePrice > 0 : "Harga dasar kamar harus positif!";
        this.roomId = roomId;
        this.basePrice = basePrice;
        this.isAvailable = true;
    }

    public String getRoomId() {
         return roomId; 
    }

    public boolean getIsAvailable() {
         return isAvailable; 
    }
    public void setAvailability(boolean status) {
         this.isAvailable = status; 
    }
    
    public abstract double calculatePrice(int nights);
}