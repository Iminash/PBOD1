/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 24/02/2026
 */

public class Garis {
    /* Atribut */
    Titik TAwal;
    Titik TAkhir;
    static int counterGaris;

    /* Method */
    // Konstruktor Untuk Garis dengan titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        TAwal.absis = 0;
        TAwal.ordinat = 0;
        TAkhir.absis = 1;
        TAkhir.ordinat = 1;
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
    // double getTAwal(){
    //     return TAwal;
    // }

    // double getTAkhir(){
    //     return TAkhir;
    // }

    // Mutator untuk atribut garis
    void setTAwal(Titik x){
        TAwal = x;
    }

    void setTAkhir(Titik y){
        TAkhir = y;
    } 

    // Method mendapatkan panjang sebuah garis
    
}
