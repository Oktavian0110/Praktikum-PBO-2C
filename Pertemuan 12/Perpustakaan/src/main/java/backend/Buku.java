package backend;

import java.sql.*;
import java.util.ArrayList;

public class Buku {

    private int idBuku;
    private Kategori kategori = new Kategori();
    private String judul,penerbit, penulis;

    public Buku(){

    }

    public Buku(Kategori kategori, String judul,String penerbit, String penulis){
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public Buku getById(int id) {
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku as idbuku,b.judul as judul,b.penerbit as penerbit,b.penulis as penulis,k.idkategori as idkategori,k.nama as nama,k.keterangan as keterangan FROM buku b LEFT JOIN kategori k ON b.idkategori = k.idkategori WHERE b.idbuku = '"+ id +"' " );
        
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit("penerbit");
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList();
         
         ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku as idbuku,b.judul as judul,b.penerbit as penerbit,b.penulis as penulis,k.idkategori as idkategori,k.nama as nama,k.keterangan as keterangan FROM buku b LEFT JOIN kategori k ON  b.idkategori=k.idkategori ");
        
         try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit("penerbit");
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return ListBuku;
    }

    public ArrayList<Buku> search(String keyword) {
        ArrayList<Buku> ListBuku = new ArrayList();

        String sql = "SELECT b.idbuku as idbuku,b.judul as judul,b.penerbit as penerbit,b.penulis as penulis,k.idkategori as idkategori,k.nama as nama,k.keterangan as keterangan FROM buku b LEFT JOIN kategori k ON b.idkategori = k.idkategori WHERE b.judul LIKE '%" +keyword+"%' OR b.penerbit LIKE '%"+ keyword +"%' OR b.penulis LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit("penerbit");
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idBuku).getIdBuku() == 0) {

            String SQL = "INSERT INTO buku (judul,idkategori, penulis, penerbit) VALUES ( '"+ this.judul+"','" + this.getKategori().getIdkategori() + "','" + this.penulis + "','"+ this.penerbit +"' )";

            this.idBuku = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE buku SET judul='"+ this.judul+"', idkategori='" + this.getKategori().getIdkategori() + "', penulis='" + this.penulis + "', penerbit='"+ this.penerbit +"' WHERE idbuku='"+this.idBuku +"'";
            
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idBuku +"'";
        DBHelper.executeQuery(SQL);
    }
}
