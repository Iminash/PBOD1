/* File         : Manusia.java
 * Deskripsi    : Program penggunaan Absract. Pembuatan Abstract Class Manusia
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */

import java.time.LocalDate;

public abstract class Manusia {
    /* Atribut */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int countMNS = 0;

    /* Method */
    // Konstruktor
    public Manusia(String nama, LocalDate tgl, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendapatan;

        countMNS += 1;

    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }public static void setCountMNS(int countMNS) {
        Manusia.countMNS = countMNS;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }

    // Method Lainnya
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    public static int getCounterMNS() {
        return countMNS;
    }
    public double getPendapatan() {
        return pendapatan;
    }

    public void printInfo(){
        System.out.println("Nama :" + getNama());
        System.out.println("tgl_mulai_kerja :" + getTgl_mulai_kerja());
        System.out.println("alamat :" + getAlamat());
        System.out.println("pendapatan :" + getPendapatan());
        System.out.println("Count Manusia: " + getCounterMNS());
    }

    public abstract int hitungMasaKerja();

}