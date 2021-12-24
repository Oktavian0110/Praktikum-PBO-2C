package backend;

import java.sql.*;
import java.util.ArrayList;
public class Pembeli implements Interface{
    int idpembeli,uang;
    String nama, alamat,telepon;

    public Pembeli() {
    }

    public Pembeli(String nama, String alamat, String telepon, int uang) {
        this.uang = uang;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getUang() {
        return uang;
    }
   

    public void setIdpembeli(int idpembeli) {
        this.idpembeli = idpembeli;
    }

    public int getIdpembeli() {
        return idpembeli;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }
    
    public Pembeli getById(int id){
        Pembeli pb = new Pembeli();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT * FROM pembeli WHERE idpembeli="+id);
        
        try {
            while (rs.next()) {                
                pb = new Pembeli();
                pb.setIdpembeli(rs.getInt("idpembeli"));
                pb.setNama(rs.getString("nama"));
                pb.setAlamat(rs.getString("alamat"));
                pb.setTelepon(rs.getString("telepon"));
                pb.setUang(rs.getInt("uang"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return pb;
    }
    
    public ArrayList<Pembeli> getAll(){
        ArrayList<Pembeli> ListBeli = new ArrayList();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT * FROM pembeli ");
        
        try {
            while (rs.next()) {                
                Pembeli pb = new Pembeli();
                pb.setIdpembeli(rs.getInt("idpembeli"));
                pb.setNama(rs.getString("nama"));
                pb.setAlamat(rs.getString("alamat"));
                pb.setTelepon(rs.getString("telepon"));
                pb.setUang(rs.getInt("uang"));
                
                ListBeli.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListBeli;
    }
    
    public ArrayList<Pembeli> search(String keyword){
        ArrayList<Pembeli> ListBeli = new ArrayList();
        String SQL = "SELECT * FROM pembeli WHERE nama LIKE '%"+this.nama+"%' OR alamat LIKE'%"+this.alamat+"%' OR telepon LIKE'%"+this.telepon+"%'";
        ResultSet rs = DBHelperKamera.selectQuery(SQL);
        
        try {
            while (rs.next()) {                
                Pembeli pb = new Pembeli();
                pb.setIdpembeli(rs.getInt("idpembeli"));
                pb.setNama(rs.getString("nama"));
                pb.setAlamat(rs.getString("alamat"));
                pb.setTelepon(rs.getString("telepon"));
                pb.setUang(rs.getInt("uang"));
                
                ListBeli.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListBeli;
    }
   

    @Override
    public void save() {
        if (getById(idpembeli).getIdpembeli()== 0) {
            String SQL = "INSERT INTO pembeli(nama,alamat,telepon,uang) VALUES ('"+this.nama+"','"+this.alamat+"','"+this.telepon+"','"+this.uang+"')";
            
            this.idpembeli = DBHelperKamera.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE pembeli SET nama='"+this.nama+"', alamat='"+this.alamat+"', telepon='"+this.telepon+"', uang='" +this.uang+"'";
            
            DBHelperKamera.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM pembeli WHERE idpembeli= "+this.idpembeli;
        DBHelperKamera.executeQuery(SQL);
    }

    
    
}
