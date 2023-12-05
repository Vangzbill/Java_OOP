package backend;

import java.sql.*;
import java.util.ArrayList;

public class Obat {
    private int kodeObat;
    private String namaObat;
    private int harga;

    public Obat(int kodeObat, String namaObat, int harga) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.harga = harga;
    }

    public Obat() {
    }


    public int getKodeObat() {
        return this.kodeObat;
    }

    public void setKodeObat(int kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return this.namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Obat getById(int id){
        Obat obt = new Obat();  
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat " 
                                            + " WHERE kodeObat = '" +id+ "'");
        
        try{
            while(rs.next()){
                obt = new Obat();
                obt.setKodeObat(rs.getInt("kodeObat"));
                obt.setNamaObat(rs.getString("namaObat"));
                obt.setHarga(rs.getInt("harga"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return obt;
    }

    public ArrayList<Obat> getAll(){
        ArrayList<Obat> ListObat = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat");
        
        try{
            while(rs.next()){
                Obat obt = new Obat();
                obt.setKodeObat(rs.getInt("kodeObat"));
                obt.setNamaObat(rs.getString("namaObat"));
                obt.setHarga(rs.getInt("harga"));
                
                ListObat.add(obt);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListObat;
    }

    public ArrayList<Obat> search(String keyword){
        ArrayList<Obat> ListObat = new ArrayList();
        
        String sql = "SELECT * FROM obat WHERE "
                    + "     kodeObat LIKE '%" + keyword + "%' "
                    + "     OR namaObat LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Obat obt = new Obat();
                obt.setKodeObat(rs.getInt("kodeObat"));
                obt.setNamaObat(rs.getString("namaObat"));
                obt.setHarga(rs.getInt("harga"));
                
                ListObat.add(obt);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListObat;
    }

    public void save(){
        if(getById(kodeObat).getKodeObat() == 0){
            String SQL = "INSERT INTO obat (kodeObat, namaObat, harga) VALUES("
                        + "     '" + this.kodeObat + "', "
                        + "     '" + this.namaObat + "', "
                        + "     '" + this.harga + "' "
                        + "     )";
            this.kodeObat = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE obat SET "
                        + "     kodeObat = '" + this.kodeObat + "', "
                        + "     namaObat = '" + this.namaObat + "', "
                        + "     harga = '" + this.harga + "' "
                        + "     WHERE kodeObat = '" + this.kodeObat + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM obat WHERE kodeObat = '" + this.kodeObat + "'";
        DBHelper.executeQuery(SQL);
    }

    public String toString(){
        return namaObat;
    }
}

