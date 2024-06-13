/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Koneksi {
    private String databasename = "pariwisata";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection Koneksidb;
    
    public Koneksi(){
    
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    //tabel user
    public void simpanUser(String tempid_user, String tempuser_name, String temppassword, String tempnama_lengkap, String tempJK, String tempalamat, String tempno_tlpn, String temptgl_lahir){
        
        try {
            //menyimpan data
            String sql = "insert into user (id_user, user_name, password, nama_lengkap, JK, alamat, no_tlpn, tgl_lahir) value (?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_user);
            perintah.setString(2, tempuser_name);
            perintah.setString(3, temppassword);
            perintah.setString(4, tempnama_lengkap);
            perintah.setString(5, tempJK);
            perintah.setString(6, tempalamat);
            perintah.setString(7, tempno_tlpn);
            perintah.setString(8, temptgl_lahir);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahUser(String tempid_user, String tempuser_name, String temppassword, String tempnama_lengkap, String tempJK, String tempalamat, String tempno_tlpn, String temptgl_lahir){
        
        try {
            //ubah data
            String sql = "update user set user_name = ?, password = ?, nama_lengkap = ?, JK = ?, alamat = ?, no_tlpn = ?, tgl_lahir = ? where id_user = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempuser_name);
            perintah.setString(2, temppassword);
            perintah.setString(3, tempnama_lengkap);
            perintah.setString(4, tempJK);
            perintah.setString(5, tempalamat);
            perintah.setString(6, tempno_tlpn);
            perintah.setString(7, temptgl_lahir);
            perintah.setString(8, tempid_user);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapusUser(String tempid_user){
        
        try {
            //hapus data
            String sql = "delete from user where id_user = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_user);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
     
    public ResultSet caridatauser(String id_user) {
        ResultSet rs = null;
        //cari data
        try {
            String query = "SELECT * FROM user WHERE id_user = ?";
            PreparedStatement ps = Koneksidb.prepareStatement(query);
            ps.setString(1, id_user);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    //tabel profil
    public void simpanprofil(String tempid_menu, String tempnama_menu, String templink, String tempicon, String tempstatus){
        
        try {
            //menyimpan data
            String sql = "insert into profil (id_menu, nama_menu, link, icon, status) value (?,?,?,?,?)";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_menu);
            perintah.setString(2, tempnama_menu);
            perintah.setString(3, templink);
            perintah.setString(4, tempicon);
            perintah.setString(5, tempstatus);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahprofil(String tempid_menu, String tempnama_menu, String templink, String tempicon, String tempstatus){
        
        try {
            //ubah data
            String sql = "update profil set nama_menu = ?, link = ?, icon = ?, status = ? where id_menu = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempnama_menu);
            perintah.setString(2, templink);
            perintah.setString(3, tempicon);
            perintah.setString(4, tempstatus);
            perintah.setString(5, tempid_menu);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapusprofil(String tempid_menu){
        
        try {
            //hapus data
            String sql = "delete from profil where id_menu = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_menu);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
        public ResultSet caridataprofil(String id_menu) {
        ResultSet rs = null;
        //cari data
        try {
            String query = "SELECT * FROM profil WHERE id_menu = ?";
            PreparedStatement ps = Koneksidb.prepareStatement(query);
            ps.setString(1, id_menu);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    //tabel menu
    public void simpanmenu(String tempisi, String tempfoto){
        
        try {
            //menyimpan data
            String sql = "insert into menu (isi, foto) value (?,?)";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempisi);
            perintah.setString(2, tempfoto);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahmenu(String tempisi, String tempfoto){
        
        try {
            //ubah data
            String sql = "update menu set foto = ? where isi = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempfoto);
            perintah.setString(2, tempisi);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapusmenu(String tempisi){
        
        try {
            //hapus data
            String sql = "delete from menu where isi = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempisi);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
        public ResultSet caridatamenu(String isi) {
        ResultSet rs = null;
        //cari data
        try {
            String query = "SELECT * FROM menu WHERE isi = ?";
            PreparedStatement ps = Koneksidb.prepareStatement(query);
            ps.setString(1, isi);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    //tabel wisata
    public void simpanwisata(String tempid_wisata, String tempnama_objek, String tempjumlah_pengunjung, String templayanan, String tempid_lokasi, String tempfoto){
        
        try {
            //menyimpan data
            String sql = "insert into wisata (id_wisata, nama_objek, jumlah_pengunjung, layanan, id_lokasi, foto) value (?,?,?,?,?,?)";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_wisata);
            perintah.setString(2, tempnama_objek);
            perintah.setString(3, tempjumlah_pengunjung);
            perintah.setString(4, templayanan);
            perintah.setString(5, tempid_lokasi);
            perintah.setString(6, tempfoto);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahwisata(String tempid_wisata, String tempnama_objek, String tempjumlah_pengunjung, String templayanan, String tempid_lokasi, String tempfoto){
        
        try {
            //ubah data
            String sql = "update wisata set nama_objek = ?, jumlah_pengunjung = ?, layanan = ?, id_lokasi = ?, foto = ? where id_wisata = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempnama_objek);
            perintah.setString(2, tempjumlah_pengunjung);
            perintah.setString(3, templayanan);
            perintah.setString(4, tempid_lokasi);
            perintah.setString(5, tempfoto);
            perintah.setString(6, tempid_wisata);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapuswisata(String tempid_wisata){
        
        try {
            //hapus data
            String sql = "delete from wisata where id_wisata = ?";
            PreparedStatement perintah = Koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid_wisata);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public ResultSet caridatawisata(String id_wisata) {
        ResultSet rs = null;
        //cari data
        try {
            String query = "SELECT * FROM wisata WHERE id_wisata = ?";
            PreparedStatement ps = Koneksidb.prepareStatement(query);
            ps.setString(1, id_wisata);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
}