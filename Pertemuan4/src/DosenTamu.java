/* Nama File : DosenTamu.java
 * Deskripsi : Subclass dari Dosen untuk merepresentasikan dosen tamu.
 * Pembuat   : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal   : 14/03/2026
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDK, String tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        this.tanggalBerakhirKontrak = LocalDate.parse(tanggalBerakhirKontrak, formatter);
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIDK\t\t: " + NIDK);
        super.printInfo();
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Tgl Berakhir Kontrak: " + formatTanggal(tanggalBerakhirKontrak));
        System.out.println("Tunjangan\t: 2.5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
        System.out.println("-----------------------------------\n");
    }
}