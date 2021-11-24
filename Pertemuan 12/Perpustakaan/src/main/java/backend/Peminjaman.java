package backend;

import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam, tanggalKembali;

    public Peminjaman(){

    }

    public Peminjaman(Anggota anggota, Buku buku, String tglPinjam, String tglKembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tglPinjam;
        this.tanggalKembali = tglKembali;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    
    public Peminjaman getById(int id) {
        Peminjaman pjm = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman as idpeminjaman,a.nama,b.judul,p.tanggalpinjam,p.tanggalkembali FROM anggota a,buku b,peminjaman p WHERE p.idpeminjaman='"+id+"' AND p.idanggota=a.idanggota AND p.idbuku=b.idbuku");
        
        try {
            while (rs.next()) {                
                pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pjm;
    }

    public Peminjaman cariAnggota(int id){
        Peminjaman pjm = new Peminjaman();
        String SQL = "SELECT a.nama FROM anggota a,buku b,peminjaman p WHERE a.idanggota="+id+"";
        ResultSet rs = DBHelper.selectQuery(SQL);
        
//        pjm.getAnggota().setNama(rs.getString("nama"));
        
        try {
            while (rs.next()) {                
                pjm = new Peminjaman();
                pjm.getAnggota().setNama(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pjm;
    }
    
     public Peminjaman cariBuku(int id){
        Peminjaman pjm = new Peminjaman();
        String SQL = "SELECT b.judul FROM anggota a,buku b,peminjaman p WHERE  b.idbuku="+id+"";
        ResultSet rs = DBHelper.selectQuery(SQL);
        
//        pjm.getAnggota().setNama(rs.getString("nama"));
        
        try {
            while (rs.next()) {                
                pjm = new Peminjaman();
                pjm.getBuku().setJudul(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pjm;
    }
    
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman as idpeminjaman, a.nama as nama, a.alamat as alamat, a.telepon as telepon, a.idanggota as idanggota,b.idbuku as idbuku,b.penerbit as penerbit,b.penulis as penulis, b.judul as judul, p.tanggalpinjam as tanggalpinjam, p.tanggalkembali as tanggalkembali FROM peminjaman p, anggota a, buku b WHERE p.idanggota = a.idanggota AND p.idbuku=b.idbuku");
        try {
            while (rs.next()) {                
                Peminjaman pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setTelepon(rs.getString("telepon"));
                pjm.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getAnggota().setAlamat(rs.getString("alamat"));
                pjm.getBuku().setIdBuku(rs.getInt("idbuku"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.getBuku().setPenerbit(rs.getString("penerbit"));
                pjm.getBuku().setPenulis(rs.getString("penulis"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(pjm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return ListPeminjaman;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPjm = new ArrayList();
        String SQL = "SELECT p.idpeminjaman as idpeminjaman, a.nama as nama, b.judul as judul, p.tanggalpinjam as tanggalpinjam, p.tanggalkembali as tanggalkembali FROM peminjaman p, anggota a, buku b WHERE a.nama LIKE '%" + keyword+"%' OR b.judul LIKE '%"+keyword+"%' OR p.tanggalpinjam LIKE '%"+keyword+"%' OR p.tanggalkembali LIKE '%" +keyword+"%'";
        
        ResultSet rs = DBHelper.selectQuery(SQL);
        try {
            while (rs.next()) {                
                Peminjaman pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
                ListPjm.add(pjm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPjm;
    }

    public void save() {
        if(getById(idPeminjaman).getIdPeminjaman() == 0){
           String SQL = "INSERT INTO peminjaman (idanggota,idbuku, tanggalpinjam, tanggalkembali) VALUES ( "+ this.getAnggota().getIdAnggota()+"," + this.getBuku().getIdBuku() + "," + this.tanggalPinjam + ", "+ this.tanggalKembali +")";
           
           this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE peminjaman SET idanggota='"+this.getAnggota().getIdAnggota()+"', idbuku='"+this.getBuku().getIdBuku()+"', tanggalpinjam="+this.tanggalPinjam+", tanggalkembali="+this.tanggalKembali+"";
            
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman ='" +this.idPeminjaman+"'";
        DBHelper.executeQuery(SQL);
    }
}

