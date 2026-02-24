/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 24/02/2026
 */

public class Titik{
    /* Atribut */
    double absis;
    double ordinat;
    static int counterTitik;

    /* Method */
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Counter Titik
    static int getCounterTitik(){
        return counterTitik++;
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
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

    // Mendapatkan Lokasi Kuadran Titik
    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else {
            return 0;
        }
    }   

    // Mendapatkan Jarak titik dengan pusat
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Mendapatkan Jarak titik satu dengan titik yang lain
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    // Merefleksikan titik berdasarkan sumbu X
    void refleksiX() {
        ordinat = ordinat * -1;
    }

    // Merefleksikan titik berdasarkan sumbu Y
    void refleksiY() {
        absis = absis * -1;
    }

    void getRefleksiY() {
        Titik T = new Titik(absis * -1, ordinat);
    }
} // end class titik
