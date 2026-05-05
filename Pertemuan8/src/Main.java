/* File         : Main.java
 * Deskripsi    : Program utama untuk menguji seluruh kelas dan metode generik
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Main {
    /* Method */
    public static void main(String[] args) {
        System.out.println("I. TEST KELAS GENERIK");
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("Kitty", 3.5));
        System.out.println("Isi Datum Kucing : " + datumKucing.getIsi().getNama() + " (" + datumKucing.getIsi().getBobot() + " kg)");


        System.out.println("\n II. TEST OPERATOR GENERIK");
        OperatorGenerik op = new OperatorGenerik();

        // Test Tukar Integer
        Datum<Integer> intA = new Datum<>(); intA.setIsi(3);
        Datum<Integer> intB = new Datum<>(); intB.setIsi(6);
        System.out.println("Sebelum tukar int: a=" + intA.getIsi() + ", b=" + intB.getIsi());
        op.Tukar(intA, intB);
        System.out.println("Sesudah tukar int: a=" + intA.getIsi() + ", b=" + intB.getIsi());

        // Test Tukar String
        Datum<String> strA = new Datum<>(); strA.setIsi("Satu");
        Datum<String> strB = new Datum<>(); strB.setIsi("Dua");
        op.Tukar(strA, strB);
        System.out.println("Sesudah tukar str: a=" + strA.getIsi() + ", b=" + strB.getIsi());

        // Test Tukar Keluarga Anabul
        Datum<Anabul> anabulA = new Datum<>(); anabulA.setIsi(new Anjing("Buldog"));
        Datum<Anabul> anabulB = new Datum<>(); anabulB.setIsi(new Kucing("Oyen", 4.0));
        System.out.println("Sebelum tukar anabul: a=" + anabulA.getIsi().getNama() + ", b=" + anabulB.getIsi().getNama());
        op.Tukar(anabulA, anabulB);
        System.out.println("Sesudah tukar anabul: a=" + anabulA.getIsi().getNama() + ", b=" + anabulB.getIsi().getNama());

        // Test Bobot2 (Hanya bisa menerima Kucing dan turunannya)
        Anggora kucing1 = new Anggora("Snowy", 4.2);
        Kembangtelon kucing2 = new Kembangtelon("Belang", 3.8);
        double totalBobot = op.Bobot2(kucing1, kucing2);
        System.out.println("Total bobot Snowy dan Belang: " + totalBobot + " kg");


        System.out.println("\n III. TEST DATA");
        // Realisasi kelas Data dengan Anabul
        Data<Anabul> kandang = new Data<>();
        
        // Test setIsi
        kandang.setIsi(1, new Anggora("Lili", 3.0));
        kandang.setIsi(2, new Anjing("Heli"));
        kandang.setIsi(50, new Kembangtelon("Milo", 4.5));
        
        // Test getIsi
        System.out.println("Isi kandang no 1: " + kandang.getIsi(1).getNama());
        System.out.println("Isi kandang no 2: " + kandang.getIsi(2).getNama());
        System.out.println("Isi kandang no 50: " + kandang.getIsi(50).getNama());
        
        // Test getSize
        System.out.println("Banyak elemen terisi (efektif) di kandang: " + kandang.getSize());
    }
}