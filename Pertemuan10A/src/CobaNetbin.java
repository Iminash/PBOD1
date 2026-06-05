/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
// package CobaNetbin;
=======
package CobaNetbin;
>>>>>>> 23bc096feb16e53f702049a9302606bd4d813acf

/**
 *
 * @author imina
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CobaNetbin {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "374722"; // default Laragon biasanya kosong

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke MySQL BERHASIL!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println("Versi MySQL: " + rs.getString(1));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL tidak ditemukan.");
            System.out.println("Pastikan mysql-connector-j sudah masuk ke Libraries.");
        } catch (SQLException e) {
            System.out.println("Koneksi ke MySQL GAGAL.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
