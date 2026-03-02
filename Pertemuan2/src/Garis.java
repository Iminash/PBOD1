/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 24/02/2026
 */

public class Garis {
    /* Atribut */
    private Titik TAwal;
    private Titik TAkhir;
    private static int counterGaris;

    /* Method */
    // Konstruktor Untuk Garis dengan titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        this.TAwal = new Titik(0,0);
        this.TAkhir = new Titik(1, 1);
        counterGaris++;
    }
    Garis(Titik TAwal, Titik TAkhir){
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

    // Counter Garis
    static int getCounterGaris(){
        return counterGaris++;
    }

    void printCounterGaris(){
        System.out.println(this.counterGaris);
    }

    // Selektor untuk mendapatkan atribut garis
    Titik getTAwal(){
        return this.TAwal;
    }

    Titik getTAkhir(){
        return this.TAkhir;
    }

    // Mutator untuk atribut garis
    void setTAwal(Titik x){
        this.TAwal = x;
    }

    void setTAkhir(Titik y){
        this.TAkhir = y;
    } 

    // Method mendapatkan panjang sebuah garis
    public double getPanjang() {
        return TAwal.getJarak(TAkhir);
    }

    // Method mendapatkan Gradien dari sebuah garis
    public double getGradien() {
        double dy = TAkhir.getOrdinat() - TAwal.getOrdinat();
        double dx = TAkhir.getAbsis() - TAwal.getAbsis();
        return (dx == 0) ? Double.POSITIVE_INFINITY : dy / dx;
    }
    
    // Method mendapatkan titik tengah dari garis
    public Titik getTitikTengah() {
        double absisTengah = (TAwal.getAbsis() + TAkhir.getAbsis()) / 2;
        double ordinatTengah = (TAwal.getOrdinat() + TAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // Method mendapatkan garis baru untuk refleksi terhadap sumbu Y
    public Garis getRefleksiY() {
        Titik awalRefleksi = TAwal.getRefleksiY();
        Titik akhirRefleksi = TAkhir.getRefleksiY();
        return new Garis(awalRefleksi, akhirRefleksi);
    }
    
    // Method untuk mengecek antara 2 garis apakah tegak lurus
    public boolean isTegakLurus(Garis G) {
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        if (Double.isInfinite(gradien1) && gradien2 == 0) {
            return true;
        }
        if (Double.isInfinite(gradien2) && gradien1 == 0) {
            return true;
        }
        return Math.abs(gradien1 * gradien2 + 1) < 1e-9;
    }
    
    // Method untuk mengecek antara 2 garis apakah sejajar
    public boolean isSejajar(Garis G) {
        return Math.abs(this.getGradien() - G.getGradien()) < 1e-9;
    }

    // Method untuk print garis
    public void printGaris() {
        System.out.println("Garis dari (" + TAwal.getAbsis() + ", " + TAwal.getOrdinat() + ") ke (" 
                           + TAkhir.getAbsis() + ", " + TAkhir.getOrdinat() + ")");
    }
}

