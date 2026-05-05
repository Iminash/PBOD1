/**
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat      : Muhammad Kamal Hamzah / 24060124130056
 * Lab          : D1
 */

 public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
 }