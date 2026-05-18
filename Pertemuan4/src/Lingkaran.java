/* Nama File : Lingkaran.java
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 10/03/2026
 */

public class Lingkaran extends BangunDatar{
    /* Atribut */
    private double jari;

    /* Method */
    // Konstruktor
    public Lingkaran(){

    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    // Getter
    public double getJari(){
        return jari;
    }

    // Setter
    public void setJari(double jari){
        this.jari = jari;
    }

    // Method lainnya
    public double getLuas(){
        return this.jari * this.jari * Math.PI;
    }

    public double getKeliling(){
        return this.jari * 2  * Math.PI;
    }

    // public void printInfo(){
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Jari: " + jari);
    // }

    /* Bagian 3
    Menggunakan Overriding Method */

    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }
}