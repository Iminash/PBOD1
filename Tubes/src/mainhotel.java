/**
 * File         : mainhotel.java
 * Deskripsi    : Program utama untuk mendemonstrasikan sistem hotel (Try-Catch)
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 */

public class mainhotel {
    public static void main(String[] args) {
        Guest tamu = new Guest("Siska", "siska@email.com", "33740123");
        Receptionist staff = new Receptionist("Budi", "budi@hotel.com", "ADM-01");
        Room r1 = new StandardRoom("STD-101", 500000);
        Room r2 = new SuiteRoom("VVIP-01", 1500000);

        try {
            staff.printInfo();
            tamu.printInfo();
            Booking pesanan = new Booking(tamu, 2);
            pesanan.addRoom(r1);
            pesanan.addRoom(r2);

            double total = pesanan.calculateTotal();
            System.out.println("Total Tagihan: Rp" + total);
            Payment pay = new CreditCardPayment("4455-xxxx", total);
            pay.processPayment(total);
            
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan sistem.");
        }
    }
}