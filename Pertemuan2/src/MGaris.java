/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 24/02/2026
 */

public class MGaris {
  public static void main(String[] args) {
        System.out.println("Jumlah objek garis awal = " + Garis.getCounterGaris());
        Garis G1 = new Garis();
        Titik A = new Titik(1, 2);
        Titik B = new Titik(4, 6);
        Garis G2 = new Garis(A, B);

        System.out.print("G1 (default): ");
        G1.printGaris();
        System.out.print("G2: ");
        G2.printGaris();
        Titik C = new Titik(0,0);
        G1.setTAwal(C);
        System.out.print("G1 setelah set titik awal ke (0,0): ");
        G1.printGaris();

        System.out.println("Panjang G2: " + String.format("%.2f", G2.getPanjang()));
        System.out.println("Gradien G2: " + String.format("%.2f", G2.getGradien()));
        Titik tengahG2 = G2.getTitikTengah();
        System.out.print("Titik tengah G2: ");
        tengahG2.printTitik();

        Titik D = new Titik(2, 1);
        Titik E = new Titik(5, 5);
        Garis G3 = new Garis(D, E);
        
        Titik F = new Titik(1, 5);
        Titik G = new Titik(5, 2);
        Garis G4 = new Garis(F,G);

        System.out.print("G3: ");
        G3.printGaris();
        System.out.print("G4: ");
        G4.printGaris();

        System.out.println("Apakah G2 sejajar dengan G3? " + G2.isSejajar(G3));
        System.out.println("Apakah G2 tegak lurus dengan G4? " + G2.isTegakLurus(G4));
        System.out.println("Apakah G2 sejajar dengan G4? " + G2.isSejajar(G4));
        System.out.println("Total objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
