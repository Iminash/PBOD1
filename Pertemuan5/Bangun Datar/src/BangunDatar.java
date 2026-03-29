/* Nama File: BangunDatar.java
 * Deskripsi: Berisi Atribut dan Method untuk class Bangun Datar
 * Nama Pembuat: Muhammad Kamal Hamzah / 24060124130056
 * Tanggal: 27/03/2026
 */

public abstract class BangunDatar implements IResize {
    /* Atribut */
    protected int jumlahsisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    /* Method */
    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jumlahsisi, String warna, String border){
        this.jumlahsisi = jumlahsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public abstract double getLuas();
    public abstract double getKeliling();

    // Getter
    public int getJumlahSisi(){
        return jumlahsisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    // Setter
    public void setJmlSisi(int jumlahsisi){
        this.jumlahsisi = jumlahsisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // Method lainnya
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jumlahsisi);
        System.err.println("Warna: " + warna);
        System.err.println("Border:  " + border);
        System.err.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Bangun Datar: " + counterBangunDatar);
    }
}

    