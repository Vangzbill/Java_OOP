package backend;
import java.sql.*;
import java.util.ArrayList;

public class Pendaftaran {
    private int idPendaftaran;
    private Pasien pasien = new Pasien();
    private String tanggalPeriksa;
    private int biayaAdmin;

    public Pendaftaran(int idPendaftaran, Pasien pasien, String tanggalPeriksa, int biayaAdmin) {
        this.idPendaftaran = idPendaftaran;
        this.pasien = pasien;
        this.tanggalPeriksa = tanggalPeriksa;
        this.biayaAdmin = biayaAdmin;
    }

    public Pendaftaran() {
    }


    public int getIdPendaftaran() {
        return this.idPendaftaran;
    }

    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public int getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(int biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public String getTanggalPeriksa() {
        return this.tanggalPeriksa;
    }

    public void setTanggalPeriksa(String tanggalPeriksa) {
        this.tanggalPeriksa = tanggalPeriksa;
    }
    
    public Pendaftaran getById(int id) {
        Pendaftaran pendaftaran = new Pendaftaran();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.idPendaftaran AS id_daftar, "
                + "ps.id AS id_pasien, "
                + "ps.nama AS nama, "
                + "ps.umur AS umur, "
                + "ps.keluhan AS keluhan, "
                + "p.tanggalPeriksa AS tanggal_periksa, "
                + "p.biayaAdmin AS biaya_admin "
                + "FROM pendaftaran p "
                + "LEFT JOIN pasien ps ON ps.id = p.id "
                + "WHERE p.idPendaftaran = '" + id + "'");

        try {
            while (rs.next()) {
                pendaftaran = new Pendaftaran();
                pendaftaran.setIdPendaftaran(rs.getInt("id_daftar"));
                pendaftaran.getPasien().setId(rs.getInt("id_pasien"));
                pendaftaran.getPasien().setNama(rs.getString("nama"));
                pendaftaran.getPasien().setUmur(rs.getString("umur"));
                pendaftaran.getPasien().setKeluhan(rs.getString("keluhan"));
                pendaftaran.setTanggalPeriksa(rs.getString("tanggal_periksa"));
                pendaftaran.setBiayaAdmin(rs.getInt("biaya_admin"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pendaftaran;
    }

    public ArrayList<Pendaftaran> getAll() {
        ArrayList<Pendaftaran> ListPendaftaran = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.idPendaftaran AS id_daftar, "
                + "ps.id AS id_pasien, "
                + "ps.nama AS nama, "
                + "ps.umur AS umur, "
                + "ps.keluhan AS keluhan, "
                + "p.tanggalPeriksa AS tanggal_periksa, "
                + "p.biayaAdmin AS biaya_admin "
                + "FROM pendaftaran p "
                + "LEFT JOIN pasien ps ON ps.id = p.id ");
        try {
            while (rs.next()) {
                Pendaftaran pendaftaran = new Pendaftaran();
                pendaftaran.setIdPendaftaran(rs.getInt("id_daftar"));
                pendaftaran.getPasien().setId(rs.getInt("id_pasien"));
                pendaftaran.getPasien().setNama(rs.getString("nama"));
                pendaftaran.getPasien().setUmur(rs.getString("umur"));
                pendaftaran.getPasien().setKeluhan(rs.getString("keluhan"));
                pendaftaran.setTanggalPeriksa(rs.getString("tanggal_periksa"));
                pendaftaran.setBiayaAdmin(rs.getInt("biaya_admin"));

                ListPendaftaran.add(pendaftaran);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPendaftaran;
    }
    
    public ArrayList<Pendaftaran> search(String keyword) {
        ArrayList<Pendaftaran> ListPendaftaran = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.idPendaftaran AS id_daftar, "
                + "ps.id AS id_pasien, "
                + "ps.nama AS nama, "
                + "ps.umur AS umur, "
                + "ps.keluhan AS keluhan, "
                + "p.tanggalPeriksa AS tanggal_periksa, "
                + "p.biayaAdmin AS biaya_admin "
                + "FROM pendaftaran p "
                + "LEFT JOIN pasien ps ON ps.id = p.id "
                + "WHERE ps.nama LIKE '%" + keyword + "%' "
                + "OR ps.umur LIKE '%" + keyword + "%' "
                + "OR ps.keluhan LIKE '%" + keyword + "%' "
                + "OR p.tanggalPeriksa LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Pendaftaran pendaftaran = new Pendaftaran();
                pendaftaran.setIdPendaftaran(rs.getInt("id_daftar"));
                pendaftaran.getPasien().setId(rs.getInt("id_pasien"));
                pendaftaran.getPasien().setNama(rs.getString("nama"));
                pendaftaran.getPasien().setUmur(rs.getString("umur"));
                pendaftaran.getPasien().setKeluhan(rs.getString("keluhan"));
                pendaftaran.setTanggalPeriksa(rs.getString("tanggalPeriksa"));
                pendaftaran.setBiayaAdmin(rs.getInt("biayaAdmin"));

                ListPendaftaran.add(pendaftaran);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPendaftaran;
    }
    
    public void save() {
        if (getById(idPendaftaran).getIdPendaftaran()== 0) {
            String SQL = "INSERT INTO pendaftaran (idPendaftaran, id, tanggalPeriksa, biayaAdmin) VALUES("
                        + "'" + this.idPendaftaran + "',"
                        + "'" + this.getPasien().getId() + "',"
                        + "'" + this.tanggalPeriksa + "',"
                        + "'" + this.biayaAdmin + "')";
            this.idPendaftaran = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pendaftaran SET "
                        + "     tanggalPeriksa = '" + this.tanggalPeriksa + "', "
                        + "     id = '" + this.getPasien().getId() + "', "
                        + "     biayaAdmin = '" + this.biayaAdmin + "' "
                        + "     WHERE idPendaftaran = '" + this.idPendaftaran + "'";
            this.idPendaftaran = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM pendaftaran WHERE idPendaftaran = '" + this.idPendaftaran + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String toString(){
        return tanggalPeriksa;
    }
}
