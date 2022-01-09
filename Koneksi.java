package penjualantiket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    
    private Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/db_pesawat";
        String USER ="root";
        String PASS ="";
        
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Koneksi Gagal");
            return con=null;
        }
        
    }
        public static void main(String[] args) throws SQLException {
            Koneksi koneksi = new Koneksi();
            koneksi.getConnection();
        
    }
}       
    

