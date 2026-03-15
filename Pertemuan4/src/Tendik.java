/* Nama File : Tendik.java
 * Deskripsi : Subclass dari Pegawai untuk merepresentasikan tenaga kependidikan.
 * Pembuat   : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal   : 14/03/2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerjaTahun = Period.between(TMT, LocalDate.now()).getYears();
        return 0.01 * masaKerjaTahun * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).with(TemporalAdjusters.firstDayOfNextMonth());
    }
    
    @Override
    public void printInfo() {
        System.out.println("--- INFORMASI DETAIL TENDIK ---");
        super.printInfo();
        System.out.println("Jabatan\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t: " + bidang);
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun()));

        int masaKerjaTahun = Period.between(TMT, LocalDate.now()).getYears();
        System.out.println("Tunjangan\t: 1% x " + masaKerjaTahun + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
        System.out.println("-------------------------------\n");
    }
}