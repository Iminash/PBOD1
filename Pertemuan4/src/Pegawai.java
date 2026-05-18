/* Nama File : Pegawai.java
 * Deskripsi : Superclass untuk semua jenis pegawai, berisi atribut dan method umum.
 * Pembuat   : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal   : 14/03/2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /* Atribut */
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    /* Method */
    // Konsturuktor
    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        this.tanggalLahir = LocalDate.parse(tanggalLahir, formatter);
        this.TMT = LocalDate.parse(TMT, formatter);
        this.gajiPokok = gajiPokok;
    }

    // Method lainnya
    public String hitungMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }
    
    protected String formatRupiah(double nominal){
        return String.format(Locale.forLanguageTag("id-ID"), "Rp %,.2f", nominal);
    }

    public void printInfo() {
        System.out.println("NIP\t\t: " + NIP);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(TMT));
        System.out.println("Gaji Pokok\t: " + formatRupiah(gajiPokok));
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
    }
}