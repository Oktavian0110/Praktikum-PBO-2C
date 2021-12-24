package backend;
import java.util.ArrayList;
import java.sql.*;

public class Tipe extends Kamera{
    private Kamera kamera = new Kamera();
    private String tipe;
    private int idtipe,harga,stok;

    public Tipe() {
        
    }

    public Tipe(String tipe, int harga, Kamera kamera,int stok) {
        this.kamera = kamera;
        this.tipe = tipe;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return tipe;
    }
    
    
    public void setIdtipe(int idtipe) {
        this.idtipe = idtipe;
    }

    public int getIdtipe() {
        return idtipe;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setIdkamera(int idkamera) {
        this.idkamera = idkamera;
    }

    public int getIdkamera() {
        return idkamera;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public Kamera getKamera() {
        return kamera;
    }
    
    
    
    
    
    
    
    
    public Tipe getById(int id){
        Tipe tp = new Tipe();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT * FROM tipe WHERE idtipe=" + id);
        
        try {
            while (rs.next()) {                
                tp = new Tipe();
                tp.setIdtipe(rs.getInt("idtipe"));
                tp.setHarga(rs.getInt("harga"));
                tp.setIdkamera(rs.getInt("idkamera"));
                tp.setTipe(rs.getString("tipe"));
                tp.setStok(rs.getInt("stok"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return tp;
    }   
    
    public ArrayList<Tipe> getAllType(){
        ArrayList<Tipe> ListTipe = new ArrayList();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT k.idkamera,k.merek,t.idtipe,t.tipe,t.harga,t.stok FROM kamera k,tipe t WHERE k.idkamera=t.idkamera ORDER BY t.idkamera");
        
        try {
            while (rs.next()) {                
                Tipe tp = new Tipe();
                tp.setIdtipe(rs.getInt("idtipe"));
                tp.setHarga(rs.getInt("harga"));
                tp.setIdkamera(rs.getInt("idkamera"));                
                tp.getKamera().setMerek(rs.getString("merek"));
                tp.setTipe(rs.getString("tipe"));
                tp.setStok(rs.getInt("stok"));
                
                ListTipe.add(tp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTipe;
    }
     public ArrayList<Tipe> getAllType(int id){
        ArrayList<Tipe> ListTipe = new ArrayList();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT k.idkamera,k.merek,t.idtipe,t.tipe,t.harga,t.stok FROM kamera k,tipe t WHERE t.idkamera= "+id+" AND k.idkamera=t.idkamera");
        
        try {
            while (rs.next()) {                
                Tipe tp = new Tipe();
                tp.setIdtipe(rs.getInt("idtipe"));
                tp.setHarga(rs.getInt("harga"));
                tp.setIdkamera(rs.getInt("idkamera"));
                tp.getKamera().setMerek(rs.getString("merek"));
                tp.setTipe(rs.getString("tipe"));
                tp.setStok(rs.getInt("stok"));
                
                ListTipe.add(tp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTipe;
    }
    
    
    
    
    public ArrayList<Tipe> searchType(String keyword){
        ArrayList<Tipe> ListTipe = new ArrayList();
        String SQL ="SELECT k.idkamera,k.merek,t.tipe,t.idtipe,t.harga,t.stok FROM kamera k JOIN tipe t ON k.idkamera=t.idkamera WHERE k.merek LIKE '%" + keyword + "%' OR t.tipe LIKE '%" + keyword + "%' ORDER BY t.idkamera";
        ResultSet rs = DBHelperKamera.selectQuery(SQL);
        
        try {
            while (rs.next()) {                
                Tipe tp = new Tipe();
                tp.setIdtipe(rs.getInt("idtipe"));
                tp.setHarga(rs.getInt("harga"));
                tp.setIdkamera(rs.getInt("idkamera"));
                tp.getKamera().setMerek(rs.getString("merek"));
                tp.setTipe(rs.getString("tipe"));
                tp.setStok(rs.getInt("stok"));
                
                ListTipe.add(tp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTipe;
    }

    @Override
    public void save() {
        if(getById(idtipe).getIdtipe()== 0){
            String SQL = "INSERT INTO tipe (idkamera,tipe,harga,stok) VALUES ("+this.getKamera().getIdkamera()+",'"+this.tipe+"',"+this.harga+","+this.stok+")";
            
            this.idtipe = DBHelperKamera.insertQueryGetId(SQL);
        }else if (getTipe()== this.tipe && getHarga() == this.harga){
            String SQL = "UPDATE tipe SET tipe='"+this.tipe+"', idkamera="+this.getKamera().getIdkamera()+", harga="+this.harga+", stok =" + this.stok+ " WHERE tipe='"+this.tipe +"' AND harga="+this.harga;
            
            DBHelperKamera.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM tipe WHERE idtipe="+this.idtipe+"";
        DBHelperKamera.executeQuery(SQL);
    }
    
    
    
    
    
}
