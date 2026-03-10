/* Nama File : Persegi.java
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat : Muhammad Kamal Hamzah / 24060124130056
 * Tanggal : 10/03/2026
 */

public class Persegi extends BangunDatar{
    /* Atribut */
    private double sisi;

    /* Method */
    // KOnstruktor
    public Persegi(){
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border){
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    /* Bagian 2
    Menggunakan keyword super */

    // public Persegi(double sisi, String warna, String border){
    //     super(4, warna, border);
    //     this.sisi = sisi;
    // }

    
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;
        this.jmlSisi = 4;
    }

    /* Bagian 1.2 
    Kita tidak bisa mengakses menggunakan cara diatas karena kita mencoba mengakses atribut di superclass yang dimana itu adalah private*/

    /* Bagian 4
    Dengan menggunakan access modifier protected, kita bisa menggunakan construktor dengan memanggil atribut dari superclass */

    // Getter
    public double getSisi(){
        return sisi;
    }

    // Setter
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // Method lainnya
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    // public void printInfo(){
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Sisi: " + sisi);
    // }
    
    /* Bagian 3
    Menggunakan Overriding Method */

    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

