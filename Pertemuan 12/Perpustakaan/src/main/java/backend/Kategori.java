package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori {
    private int idkategori; 
    private String nama, keterangan;

    public Kategori(){

    }

    public Kategori(String nama, String keterangan){
        this.nama = nama;
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return nama; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public Kategori getByID(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kat;
    }

    public ArrayList<Kategori> getAll() {
        
        ArrayList<Kategori> ListKategori = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE nama LIKE '%" +keyword+"%' OR keterangan LIKE '%"+ keyword +"%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public void save() {
        if (getByID(idkategori).getIdkategori() == 0) {

            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES ( '" + this.nama + "','" + this.keterangan +"')";

            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori +"'";
        DBHelper.executeQuery(SQL);
    }
}


