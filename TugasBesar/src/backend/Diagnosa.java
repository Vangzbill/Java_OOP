package backend;
import java.sql.*;
import java.util.ArrayList;
public class Diagnosa {
    public int idPemeriksaan;
    Pasien pasien = new Pasien();
    Dokter dokter = new Dokter();
    Obat obat = new Obat();
    Pendaftaran pendaftaran = new Pendaftaran();
    public int hargaTotal;

    public Diagnosa() {
    }

    public Diagnosa(Pendaftaran pendaftaran, Pasien pasien, Dokter dokter, Obat obat, int hargaTotal) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.obat = obat;
        this.hargaTotal = hargaTotal;
    }


    public int getIdPemeriksaan() {
        return this.idPemeriksaan;
    }

    public void setIdPemeriksaan(int idPemeriksaan) {
        this.idPemeriksaan = idPemeriksaan;
    }

    public Pasien getPasien() {
        return this.pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return this.dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Obat getObat() {
        return this.obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public void setPendaftaran(Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }
    
    public int getHargaTotal() {
        return this.hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Diagnosa getById(int id){
        Diagnosa diag = new Diagnosa();  
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM diagnosa " 
                                            + " WHERE idPemeriksaan = '" +id+ "'");
        
        try{
            while(rs.next()){
                diag = new Diagnosa();
                diag.setIdPemeriksaan(rs.getInt("idPemeriksaan"));
                diag.setPendaftaran(new Pendaftaran().getById(rs.getInt("idPendaftaran")));
                diag.setPasien(new Pasien().getById(rs.getInt("id")));
                diag.setDokter(new Dokter().getById(rs.getInt("nip")));
                diag.setObat(new Obat().getById(rs.getInt("kodeObat")));
                diag.setHargaTotal(rs.getInt("hargaTotal"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return diag;
    }

    public ArrayList<Diagnosa> getAll(){
        ArrayList<Diagnosa> ListDiagnosa = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM diagnosa");
        
        try{
            while(rs.next()){
                Diagnosa diag = new Diagnosa();
                diag.setIdPemeriksaan(rs.getInt("idPemeriksaan"));
                diag.setPendaftaran(new Pendaftaran().getById(rs.getInt("idPendaftaran")));
                diag.setPasien(new Pasien().getById(rs.getInt("id")));
                diag.setDokter(new Dokter().getById(rs.getInt("nip")));
                diag.setObat(new Obat().getById(rs.getInt("kodeObat")));
                diag.setHargaTotal(rs.getInt("hargaTotal"));
                
                ListDiagnosa.add(diag);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListDiagnosa;
    }

    public int HitungTotal(int id){
        int total = 0;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM diagnosa dg "
                + "LEFT JOIN pendaftaran p ON p.idPendaftaran = dg.idPendaftaran "
                + "LEFT JOIN obat o On o.kodeObat = dg.kodeObat " 
                + "WHERE idPemeriksaan = '" + id + "' ");
        
        try{
            while(rs.next()){
                total = rs.getInt("biayaAdmin") + rs.getInt("harga");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;
    }

    public void save(){
        if(getById(idPemeriksaan).getIdPemeriksaan() == 0){
            String SQL = "INSERT INTO diagnosa (idPendaftaran, id, nip, kodeObat, hargaTotal) VALUES("
                    + "     '" + this.pendaftaran.getIdPendaftaran() + "', "
                    + "     '" + this.pasien.getId() + "', "
                    + "     '" + this.dokter.getNip() + "', "
                    + "     '" + this.obat.getKodeObat() + "', "
                    + "     '" + this.hargaTotal + "' "
                    + "     )";
            this.idPemeriksaan = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE diagnosa SET "
                    + "     idPendaftaran = '" + this.pendaftaran.getIdPendaftaran() + "', "
                    + "     id = '" + this.pasien.getId() + "', "
                    + "     nip = '" + this.dokter.getNip() + "', "
                    + "     kodeObat = '" + this.obat.getKodeObat() + "', "
                    + "     hargaTotal = '" + this.hargaTotal + "' "
                    + "     WHERE idPemeriksaan = '" + this.idPemeriksaan + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM diagnosa WHERE idPemeriksaan = '" + this.idPemeriksaan + "'";
        DBHelper.executeQuery(SQL);
    }
}
