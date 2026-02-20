/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 20/02/2026
 */

public class Titik{
    /* Atribut */
    double absis;
    double ordinat;

    /* Method */
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }
    
    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengeset absis titik ke nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik ke nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }
    
    // Menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class titik
