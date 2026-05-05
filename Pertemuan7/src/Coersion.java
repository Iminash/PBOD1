/* File         : Coersion.java
 * Deskripsi    : Nomor 1. POLIMORFISME AD HOC COERSION
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Coersion {
    /* Method */
    public static void main(String[] args) {
        // a. Polimorfisme Coersion
        int nilaiInteger = 65;
        char nilaiChar = (char) nilaiInteger;
        double nilaiReal = (double) nilaiInteger;

        System.out.println("Integer: " + nilaiInteger);
        System.out.println("Karakter: " + nilaiChar);
        System.out.println("Real: " + nilaiReal);

        // b. Integer > Real > Integer di variabel berbeda
        int integerA = 10;
        double realA = (double) integerA;
        int integerB = (int) realA;

        System.out.println("Integer A: " + integerA);
        System.out.println("Real A: " + realA);
        System.out.println("Integer B: " + integerB);

        // c. Operasi String X, Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("String S (Konkat): " + S);
        System.out.println("Integer Z (Penjumlahan): " + Z);

        // d. Operasi String P, Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("String R (Konkat): " + R);
        System.out.println("Double D (Penjumlahan): " + D);

        // e. Konversi nilai S ke objek Integer A
        Integer A = Integer.parseInt(S);
        System.out.println("Objek Integer A (Konversi dari S): " + A);

        // f. Konversi nilai A ke objek String T
        String T = String.valueOf(A);
        System.out.println("Objek String T (Konversi dari A): " + T);
    }
}