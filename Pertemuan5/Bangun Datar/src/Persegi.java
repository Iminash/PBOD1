/* Nama File : Persegi.java
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 10/03/2026
 */

// Kelas Persegi yang merupakan turunan dari BangunDatar
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
        printCounterBangunDatar();  
    }

    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        printCounterBangunDatar();
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Diagonal: " + getDiagonal());
    }

    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

}