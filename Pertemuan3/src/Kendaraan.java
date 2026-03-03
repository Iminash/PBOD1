/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 03/03/2026
 */

public class Kendaraan {
    /* Atribut */
    private String noPlat;
    private String jenis;

    /* Method */
    // Konstruktor
    public Kendaraan(){

    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor
    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    // Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    // Method lainnya
    public void printDetailKndrn(){
        System.out.println("No.Plat: " + this.noPlat);
        System.out.println("Jenis: " + this.jenis);
    }
} // end class Kendaraan
