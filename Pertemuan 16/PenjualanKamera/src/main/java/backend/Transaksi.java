package backend;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Transaksi implements Interface{
    
    int idtransaksi;
    Pembeli pembeli = new Pembeli();
    Tipe tipe = new Tipe();
    String tanggalbeli;

    public Transaksi() {
    }

    public Transaksi(Pembeli pembeli, Tipe tipe, String tanggalbeli) {
       this.pembeli = pembeli;
        this.tipe = tipe;
        this.tanggalbeli = tanggalbeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setTipe(Tipe tipe) {
        this.tipe = tipe;
    }

    public Tipe getTipe() {
        return tipe;
    }
    
    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

    public void setTanggalbeli(String tanggalbeli) {
        this.tanggalbeli = tanggalbeli;
    }

    public String getTanggalbeli() {
        return tanggalbeli;
    }
    
    public Transaksi getById(int id){
        Transaksi tr = new Transaksi();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT t.idtransaksi,p.idpembeli,p.nama,tp.idtipe,k.merek ,tp.tipe,t.tanggalbeli FROM transaksi t, pembeli p, tipe tp, kamera k WHERE t.idtransaksi="+id +" AND tp.idkamera=k.idkamera");
        
        try {
            while (rs.next()) {                
                tr = new Transaksi();
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getTipe().setIdtipe(rs.getInt("idtipe"));
                tr.getTipe().setTipe(rs.getString("tipe"));
                tr.getPembeli().setNama(rs.getString("nama"));
                tr.getTipe().getKamera().setMerek("merek");
                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalbeli(rs.getString("tanggalbeli"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return tr;
    }
    
    public ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi> ListTr = new ArrayList();
        ResultSet rs = DBHelperKamera.selectQuery("SELECT t.idtransaksi,p.idpembeli,p.nama,tp.idtipe,k.merek,tp.harga ,tp.tipe,t.tanggalbeli FROM transaksi t, pembeli p, tipe tp, kamera k WHERE t.idpembeli=p.idpembeli AND t.idtipe = tp.idtipe AND tp.idkamera=k.idkamera");
        
        try {
            while (rs.next()) {                
                Transaksi tr = new Transaksi();
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getTipe().setIdtipe(rs.getInt("idtipe"));
                tr.getTipe().setTipe(rs.getString("tipe"));
                tr.getTipe().setHarga(rs.getInt("harga"));
                tr.getPembeli().setNama(rs.getString("nama"));
                tr.getTipe().getKamera().setMerek(rs.getString("merek"));
                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalbeli(rs.getString("tanggalbeli"));
                
                ListTr.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTr;
    }
    
    public ArrayList<Transaksi> search(String keyword){
        ArrayList<Transaksi> ListTr = new ArrayList();
        String SQL = "SELECT t.idtransaksi,t.idpembeli,p.nama,tp.idtipe,k.merek ,tp.tipe,t.tanggalbeli FROM transaksi t JOIN pembeli p ON t.idpembeli=p.idpembeli JOIN tipe tp ON t.idtipe=tp.idtipe JOIN kamera k  ON k.idkamera = tp.idkamera WHERE  t.tanggalbeli LIKE'%"+keyword+ "%' OR k.merek LIKE'%"+keyword+"%' OR tp.tipe LIKE'%" +keyword+"%' OR p.nama LIKE'%"+keyword+"%'" ;
        ResultSet rs = DBHelperKamera.selectQuery(SQL);
        
        try {
            while (rs.next()) {                
                Transaksi tr = new Transaksi();
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getTipe().setIdtipe(rs.getInt("idtipe"));
                tr.getTipe().setTipe(rs.getString("tipe"));
                tr.getPembeli().setNama(rs.getString("nama"));
                tr.getTipe().getKamera().setMerek("merek");
                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalbeli(rs.getString("tanggalbeli"));
                
                ListTr.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTr;
    }
    

    @Override
    public void save() {
        if (getById(idtransaksi).getIdtransaksi() == 0) {
            String SQL = "INSERT INTO transaksi(idpembeli,idtipe,tanggalbeli) VALUES ("+this.getPembeli().getIdpembeli()+", "+this.getTipe().getIdtipe()+", '"+this.tanggalbeli+"')";
            
            this.idtransaksi = DBHelperKamera.insertQueryGetId(SQL);
            
            String SQLst = "UPDATE tipe SET stok = " + this.getTipe().getStok() +" - 1 WHERE idtipe=" + this.getTipe().getIdtipe() ;
            DBHelperKamera.executeQuery(SQLst);
        }else{ 
            String SQL = "UPDATE transaksi SET idpembeli="+this.getPembeli().getIdpembeli()+", idtipe="+this.getTipe().getIdtipe()+", tanggalbeli='"+this.tanggalbeli+"'";
            DBHelperKamera.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM transaksi WHERE idtransaksi="+this.idtransaksi;
        DBHelperKamera.executeQuery(SQL);
    }


    
}
