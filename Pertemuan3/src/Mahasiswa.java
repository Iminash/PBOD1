/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class mahasiswa
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 03/03/2026
 */

import java.util.ArrayList;

public class Mahasiswa{
    /* Atribut */
    private String nim; 
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listmatkul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    /* Method */
    // Konstruktor
    public Mahasiswa(){
        this.listmatkul = new ArrayList<>();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.nim = NIM;
        this.nama = Nama;
        this.prodi = Prodi;
        this.listmatkul = new ArrayList<>();
    }

    // Selektor
    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenwali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    // Mutator 
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public void setDosenWali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Method lainnya
    public void addMatkul(MataKuliah matkul){
        if (listmatkul.size() < 50){
            listmatkul.add(matkul);
        } else {
            System.out.println("Mata Kuliah Melebihi 50");
        }
    }

    public int getJumlahSKS() {
        int sumSks = 0;
        for (MataKuliah mk : listmatkul) {
            sumSks += mk.getSks();
        }
        return sumSks;
    }

    public int getJumlahMatKul() {
        return listmatkul.size();
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jenis Kendaraan adalah " + kendaraan.getJenis() + " dengan no.Plat: " + kendaraan.getNoPlat());
        System.out.println("Dosen Wali: " + dosenwali.getNama());
        int i;
        for(i=0;i<listmatkul.size();i++){
            System.out.println(listmatkul.get(i).getNama());
        }
    }
} // end class Mahasiswa
