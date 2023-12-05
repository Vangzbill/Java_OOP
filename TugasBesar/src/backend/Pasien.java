package backend;
import java.sql.*;
import java.util.ArrayList;

public class Pasien {
    private int id;
    private String nama;
    private String umur;
    private String alamat;
    private String keluhan;

    public Pasien(int id, String nama, String umur, String alamat, String keluhan) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.keluhan = keluhan;
    }


    public Pasien() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return this.umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    public Pasien getById(int id){
        Pasien ps = new Pasien();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien " 
                                            + " WHERE id = '" +id+ "'");
        
        try{
            while(rs.next()){
                ps = new Pasien();
                ps.setId(rs.getInt("id"));
                ps.setNama(rs.getString("nama"));
                ps.setUmur(rs.getString("umur"));
                ps.setAlamat(rs.getString("alamat"));
                ps.setKeluhan(rs.getString("keluhan"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ps;
    }
    
     public ArrayList<Pasien> getAll(){
        ArrayList<Pasien> ListPasien = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien");
        
        try{
            while(rs.next()){
                Pasien ps = new Pasien();
                ps.setId(rs.getInt("id"));
                ps.setNama(rs.getString("nama"));
                ps.setUmur(rs.getString("umur"));
                ps.setAlamat(rs.getString("alamat"));
                ps.setKeluhan(rs.getString("keluhan"));
                
                ListPasien.add(ps);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPasien;
    }
    
    public ArrayList<Pasien> search(String keyword){
        ArrayList<Pasien> ListPasien = new ArrayList();
        
        String sql = "SELECT * FROM pasien WHERE "
                    + "     nama LIKE '%" + keyword + "%' "
                    + "     OR umur LIKE '%" + keyword + "%' "
                    + "     OR alamat LIKE '%" + keyword + "%' "
                    + "     OR keluhan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Pasien ps = new Pasien();
                ps.setId(rs.getInt("id"));
                ps.setNama(rs.getString("nama"));
                ps.setUmur(rs.getString("umur"));
                ps.setAlamat(rs.getString("alamat"));
                ps.setKeluhan(rs.getString("keluhan"));
                
                ListPasien.add(ps);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPasien;
    }
    
    public void save(){
        if(getById(id).getId() == 0){
            String SQL = "INSERT INTO pasien (nama, umur, alamat, keluhan) VALUES ("
                    + "     '" + this.nama + "', "
                    + "     '" + this.umur + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.keluhan + "' "
                    + "     )";
            this.id = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE pasien SET "
                    + "     nama = '" + this.nama + "' "
                    + "     umur = '" + this.umur + "' "
                    + "     alamat = '" + this.alamat + "' "
                    + "     keluhan = '" + this.keluhan + "' "
                    + "     WHERE idanggota = '" +this.id + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM pasien WHERE id = '" +this.id+ "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String toString(){
        return nama;
    }
}
