/* Nama File : Lingkaran.java
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 17/03/2026
 */

// Kelas Lingkaran yang merupakan turunan dari BangunDatar
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
        printCounterBangunDatar();
    }

    public Lingkaran(double jari, String warna, String border){
        super(1,warna,border);
        this.jari = jari;
        printCounterBangunDatar();
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return Math.PI * jari * 2;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

}