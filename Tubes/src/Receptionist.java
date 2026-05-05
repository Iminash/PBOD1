/**
 * File         : Receptionist.java
 * Deskripsi    : Kelas turunan User yang memiliki fitur pengelolaan harga kamar (Assertion)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class Receptionist extends User {
    /* Atribut */
    private String employeeId;
    /* Method */
    public Receptionist(String username, String email, String employeeId) {
        super(username, email);
        this.employeeId = employeeId;
    }

    public void updateRoomPrice(Room r, double newPrice) {
        assert newPrice > 0 : "Harga pembaruan kamar tidak boleh nol atau negatif!";
        r.basePrice = newPrice;
        System.out.println("Receptionist " + username + " memperbarui harga kamar " + r.getRoomId());
    }

    @Override
    public void printInfo() {
        System.out.println("RECEPTIONIST INFO:");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Username    : " + username);
    }
}