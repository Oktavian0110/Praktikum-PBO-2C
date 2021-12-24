package backend;

import java.sql.*;
import java.util.ArrayList;

public class Kamera implements Interface{
       int idkamera;
       String merek;
    
    public Kamera() {
        
    }

    public Kamera(String merek){

        this.merek = merek;
    }

    @Override
    public String toString() {
        return merek;
    }
    
    
    public void setIdkamera(int idkamera) {
        this.idkamera = idkamera;
    }

    public int getIdkamera() {
        return idkamera;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }
    
    public Kamera getById(int id){
        Kamera kmr = new Kamera();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT * FROM kamera WHERE idkamera="+id+"");
        
        try {
            while (rs.next()) {                
                kmr = new Kamera();
                kmr.setIdkamera(rs.getInt("idkamera"));
                kmr.setMerek(rs.getString("merek"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kmr;
    }
    
    public ArrayList<Kamera> getAll(){
        ArrayList<Kamera> ListKamera = new ArrayList();
        
        ResultSet rs = DBHelperKamera.selectQuery("SELECT * FROM kamera");
        
        try {
            while (rs.next()) {                
                Kamera kmr = new Kamera();
                kmr.setIdkamera(rs.getInt("idkamera"));
                kmr.setMerek(rs.getString("merek"));
                
                ListKamera.add(kmr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKamera;
    }
    
    public ArrayList<Kamera> search(String keyword){
        ArrayList<Kamera> ListKamera = new ArrayList();
        String SQL = "SELECT * FROM kamera WHERE merek LIKE'%" + keyword +"%'";
        
        ResultSet rs = DBHelperKamera.selectQuery(SQL);
        
        try {
            while (rs.next()) {                
                Kamera kmr = new Kamera();
                kmr.setIdkamera(rs.getInt("idkamera"));
                kmr.setMerek(rs.getString("merek"));
                
                ListKamera.add(kmr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKamera;
    }

    @Override
    public void save() {
        if(getById(idkamera).getIdkamera() == 0){
            String SQL = "INSERT INTO kamera (merek) VALUES ('" +this.merek +"')";
            
            this.idkamera = DBHelperKamera.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE kamera SET merek='"+this.merek+"'";
            
            DBHelperKamera.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM kamera WHERE idkamera="+this.idkamera+"";
        DBHelperKamera.executeQuery(SQL);
    }

    
    
    
}
