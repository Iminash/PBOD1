/* File         : PNS.java
 * Deskripsi    : Program penggunaan Abstract dan Interface. Pembuatan Subclass PNS
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /* Atribut */
    private String nip;
    private static int countPNS = 0;

    /* Method */
    // Konstruktor
    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan,String nip){
        super(nama,tgl,alamat,pendapatan);
        this.nip = nip;
        countPNS += 1;
    }

    /* Mutator */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* Selektor */
    public String getNip() {
        return nip;
    }
    public static int getCounterPNS(){
        return countPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 8;
    }
    
    public double hitungPajak(){
        return (10.0/100.0) * pendapatan;
    }

    // Method Lainnya
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIP: " + getNip());
        System.out.println("Count PNS: " + getCounterPNS());
        System.out.println("Masa Kerja:  " + this.hitungMasaKerja());
        System.out.println("Pajak: " + this.hitungPajak());
    }
}