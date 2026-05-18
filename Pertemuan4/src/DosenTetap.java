/* Nama File : DosenTetap.java
 * Deskripsi : Subclass dari Dosen untuk merepresentasikan dosen tetap.
 * Pembuat   : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal   : 14/03/2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        int masaKerjaTahun = Period.between(TMT, LocalDate.now()).getYears();
        return 0.02 * masaKerjaTahun * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).with(TemporalAdjusters.firstDayOfNextMonth());
    }

    @Override
    public void printInfo() {
        System.out.println("NIDN\t\t: " + NIDN);
        super.printInfo();
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun()));

        int masaKerjaTahun = Period.between(TMT, LocalDate.now()).getYears();
        System.out.println("Tunjangan\t: 2% x " + masaKerjaTahun + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
    }
}