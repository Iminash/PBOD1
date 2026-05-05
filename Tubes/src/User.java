/**
 * File         : User.java
 * Deskripsi    : Kelas abstrak untuk merepresentasikan pengguna sistem hotel secara umum
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */
public abstract class User {
    /* Atribut */
    protected String username;
    protected String email;
    protected static int counterUser = 0;
    /* Method */
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        counterUser++;
    }
    
    public abstract void printInfo();
}