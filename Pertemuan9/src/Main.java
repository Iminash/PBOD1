/* File         : Main.java
 * Deskripsi    : Program utama 
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

public class Main {
    /* Method */
    public static void main(String[] args) {
        System.out.println("I. TEST KELAS TEMAN (List) ");
        Teman t = new Teman();
        
        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Siti");
        t.addNama("Andi"); // Tambah nama duplikat untuk test countNama
        
        t.showTeman();
        System.out.println("Jumlah teman saat ini (nbelm): " + t.getNbelm());
        
        System.out.println("\nCek apakah Budi member? " + t.isMember("Budi"));
        
        t.gantiNama("Siti", "Aisyah");
        System.out.println("Setelah Siti diganti Aisyah:");
        t.showTeman();
        
        System.out.println("Jumlah nama 'Andi': " + t.countNama("Andi"));
        
        t.delNama("Budi");
        System.out.println("Setelah Budi dihapus:");
        t.showTeman();


        System.out.println("\n\n II. TEST KELAS PIARAAN (Queue)");
        Piaraan klinik = new Piaraan();
        
        Kucing k1 = new Kucing("Milo", 3.5);
        Anggora k2 = new Anggora("Snowy", 4.2);
        Anjing a1 = new Anjing("Rex");

        // Test Enqueue
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k2);
        
        System.out.println("Antrean saat ini:");
        klinik.showAnabul();
        System.out.println("Total hewan (nbelm): " + klinik.getNbelm());
        
        // Test Jenis Anabul
        System.out.println("\nDetail Jenis:");
        klinik.showJenisAnabul();
        
        // Test Count & Bobot Kucing
        System.out.println("\nJumlah keluarga kucing: " + klinik.countKucing());
        System.out.println("Total bobot keluarga kucing: " + klinik.bobotKucing() + " kg");
        
        // Test Peek & Dequeue
        System.out.println("\nHewan urutan pertama (getAnabul): " + klinik.getAnabul().getNama());
        
        Anabul dirawat = klinik.dequeueAnabul();
        System.out.println("Hewan yang sedang dirawat (dequeue): " + dirawat.getNama());
        
        System.out.println("Sisa antrean setelah " + dirawat.getNama() + " dirawat:");
        klinik.showAnabul();
    }
}