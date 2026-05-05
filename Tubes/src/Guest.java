/**
 * File         : Guest.java
 * Deskripsi    : Kelas turunan User yang merepresentasikan tamu hotel (Inheritance)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */
public class Guest extends User {
    /* Atribut */
    private String identityNumber;
    /* Method */
    public Guest(String username, String email, String identityNumber) {
        super(username, email);
        this.identityNumber = identityNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("GUEST INFO:");
        System.out.println("Username  : " + username);
        System.out.println("Email     : " + email);
        System.out.println("ID KTP    : " + identityNumber);
    }
}