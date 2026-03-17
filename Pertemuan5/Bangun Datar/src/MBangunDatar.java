/* File         : MBangunDatar.java
 * Deskripsi    : Main program penggunaan Abstract dan Interface.
 * Pembuat      : Muhammad Kamal Hamzah - 2406012430056
 * Lab          : D1
 */

public class MBangunDatar{
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10,"hitam","hitam");
        Persegi P2 = new Persegi(10,"hitam","hitam");
        BangunDatar L1 = new Lingkaran(7,"hitam","hitam");
        Lingkaran L2 = new Lingkaran (14,"hitam","hitam");

        System.out.println("========== Membuat Objek Persegi ==========");
        System.out.println("Persegi P1:");
        P1.printInfo();

        System.out.println("Persegi P2:");
        P2.printInfo();
        System.out.println(P1.isEqualLuas(P2)); 

        System.out.println("========== Zoom in P1 ====================");
        P1.zoomIn();
        P1.printInfo();

        System.out.println("========== Zoom out P2 ====================");
        P2.zoomOut();
        P2.printInfo();

        System.out.println("========== Membuat Objek Lingkaran ==========");
        System.out.println("Lingkaran L1:");
        L1.printInfo();

        System.out.println("Lingkaran L2:");
        L2.printInfo();

        System.out.println("========== Zoom L1 ====================");
        L1.zoom(50);
        L1.printInfo();
    }
}