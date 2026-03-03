/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 03/03/2026
 */

public class MataKuliah {
    /* Atribut */
    private String idMatkul;
    private String nama;
    private int sks;

    /* Method */
    // Konstruktor
    public MataKuliah(){

    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor
    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }

    // Mutator
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    // Method lainnya
    public void printDetailMK(){
        System.out.println("Id Matkul: " + this.idMatkul);
        System.out.println("Nama: " + this.nama);
        System.out.println("Sks: " + this.sks);
    }
}
