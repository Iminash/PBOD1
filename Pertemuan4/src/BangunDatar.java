/* Nama File : BangunDatar.java
 * Deskripsi : Berisi atribut dan method dalam class BangunDatar
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 10/03/2026
 */

// public final class BangunDatar
/* Bagian 5
Membuat class Bangun datar menjadi final sehingga tidak dapat menjadi superclass / tidak bisa memberi inheritance */

public class BangunDatar{
    /* Atribut */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;
    
    /*Bagian 4
    Menggunakan access modifier protected */

    /* Method */
    // Konstruktor 
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // Getter sisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    // Setter sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
    
    // Getter warna
    public String getWarna(){
        return warna;
    }

    // Setter warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // Getter border
    public String getBorder(){
        return border;
    }

    // Setter border
    public void setBorder(String border){
        this.border = border;
    }

    // printinfo bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}


