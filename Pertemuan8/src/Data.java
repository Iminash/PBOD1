/* File         : Data.java
 * Deskripsi    : Kelas struktur data array statik generik
 * Pembuat      : Muhammad Kamal Hamzah - 24060124130056
 * Lab          : D1
 */
public class Data<T> {
    /* Atribut */
    // Array berukuran statis/tetap (100 elemen)
    private Object[] ruang = new Object[100]; 
    private int banyak = 0;

    /* Method */
    public void setIsi(int posisi, T objek) {
        // Asumsi posisi dari 1 hingga 100 sesuai petunjuk
        if (posisi >= 1 && posisi <= 100) {
            // Jika sebelumnya kosong, maka elemen efektif bertambah
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi di luar jangkauan (1-100)");
        }
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (T) ruang[posisi - 1]; // Casting kembali ke T
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}