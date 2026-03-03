/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 03/03/2026
 */

public class Dosen {
    /* Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /* Method */
    // Konstruktor
    public Dosen(){

    }

    public Dosen(String NIP, String Nama, String Prodi){
        this.nip = NIP;
        this.nama = Nama;
        this.prodi = Prodi;
    }

    // Selektor
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    // Mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Method lainnya
    public void printDetailDsn(){
        System.out.println("NIP: " + this.nip);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }
    
} // end class Dosen

