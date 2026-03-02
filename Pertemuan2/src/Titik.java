/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 24/02/2026
 */

public class Titik{
    /* Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik;

    /* Method */
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Counter Titik
    static int getCounterTitik(){
        return counterTitik;
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
    
    // Mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    // Mengeset absis titik ke nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    // Mengeset ordinat titik ke nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }
    
    // Menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        this.absis += x;
        this.ordinat += y;
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
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // Mendapatkan Jarak titik satu dengan titik yang lain
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getOrdinat(), 2));
    }

    // Merefleksikan titik berdasarkan sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Merefleksikan titik berdasarkan sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    // Menghasilkan titik baru untuk refleksi berdasarkan sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghasilkan titik baru untuk refleksi berdasarkan sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

} // end class titik
