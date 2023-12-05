package backend;
import java.sql.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Dokter implements IDataPegawai{
    private Pendaftaran pendaftaran = new Pendaftaran();
    private Pasien pasien = new Pasien();
    private int nip;
    private String nama_dokter;
    private String alamat;
    private String noHp;

    public Dokter(int nip, String nama_dokter, Pendaftaran pendaftaran, Pasien pasien, String alamat, String noHp) {
        this.nip = nip;
        this.nama_dokter = nama_dokter;
        this.alamat = alamat;
        this.noHp = noHp;
        this.pasien = pasien;
        this.pendaftaran = pendaftaran;
    }

    public Dokter() {
    }

    public void setPendaftaran(Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNamaDokter() {
        return this.nama_dokter;
    }

    public void setNamaDokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return this.noHp;
    }

    
    
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

        public Dokter getById(int id) {
        Dokter dokter = new Dokter();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "d.nip AS nip, "
                + "d.nama_dokter AS nama_dokter, "
                + "d.alamat AS alamat, "
                + "d.noHp AS noHp, "
                + "p.idPendaftaran AS idPendaftaran, "
                + "p.tanggalPeriksa AS tanggalPeriksa,"
                + "ps.id AS id, "
                + "ps.nama AS nama, "
                + "ps.keluhan AS keluhan "
                + "FROM dokter d "
                + "LEFT JOIN pendaftaran p ON d.idPendaftaran = p.idPendaftaran "
                + "LEFT JOIN pasien ps ON p.id = ps.id "
                + "WHERE d.nip = '" + id + "'");

        try {
            while (rs.next()) {
                dokter = new Dokter();
                dokter.setNip(rs.getInt("nip"));
                dokter.setNamaDokter(rs.getString("nama_dokter"));
                dokter.setAlamat(rs.getString("alamat"));
                dokter.setNoHp(rs.getString("noHp"));
                dokter.getPendaftaran().setIdPendaftaran(rs.getInt("idPendaftaran"));
                dokter.getPendaftaran().setTanggalPeriksa(rs.getString("tanggalPeriksa"));
                dokter.getPasien().setId(rs.getInt("id"));
                dokter.getPasien().setNama(rs.getString("nama"));
                dokter.getPasien().setKeluhan(rs.getString("keluhan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dokter;
    }

    public ArrayList<Dokter> getAll() {
        ArrayList<Dokter> ListDokter = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "d.nip AS nip, "
                + "d.nama_dokter AS nama_dokter, "
                + "d.alamat AS alamat, "
                + "d.noHp AS noHp, "
                + "p.idPendaftaran AS idPendaftaran, "
                + "p.tanggalPeriksa AS tanggalPeriksa,"
                + "ps.id AS id, "
                + "ps.nama AS nama, "
                + "ps.keluhan AS keluhan "
                + "FROM dokter d "
                + "LEFT JOIN pendaftaran p ON d.idPendaftaran = p.idPendaftaran "
                + "LEFT JOIN pasien ps ON p.id = ps.id ");

        try {
            while (rs.next()) {
                Dokter dokter = new Dokter();
                dokter.setNip(rs.getInt("nip"));
                dokter.setNamaDokter(rs.getString("nama_dokter"));
                dokter.setAlamat(rs.getString("alamat"));
                dokter.setNoHp(rs.getString("noHp"));
                dokter.getPendaftaran().setIdPendaftaran(rs.getInt("idPendaftaran"));
                dokter.getPendaftaran().setTanggalPeriksa(rs.getString("tanggalPeriksa"));
                dokter.getPasien().setId(rs.getInt("id"));
                dokter.getPasien().setNama(rs.getString("nama"));
                dokter.getPasien().setKeluhan(rs.getString("keluhan"));

                ListDokter.add(dokter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDokter;
    }
    
    public ArrayList<Dokter> search(String keyword) {
        ArrayList<Dokter> ListDokter = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "d.nip AS nip, "
                + "d.nama_dokter AS nama_dokter, "
                + "d.alamat AS alamat, "
                + "d.noHp AS noHp, "
                + "p.idPendaftaran AS idPendaftaran, "
                + "p.tanggalPeriksa AS tanggalPeriksa"
                + "ps.id AS id, "
                + "ps.nama AS nama, "
                + "ps.keluhan AS keluhan "
                + "FROM dokter d "
                + "LEFT JOIN pendaftaran p ON d.idPendaftaran = p.idPendaftaran "
                + "LEFT JOIN pasien ps ON p.id = ps.id "
                + "WHERE d.nama_dokter LIKE '%" + keyword + "%' "
                + "OR d.nip LIKE '%" + keyword + "%' "
                + "OR d.alamat LIKE '%" + keyword + "%' "
                + "OR d.noHp LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Dokter dokter = new Dokter();
                dokter.setNip(rs.getInt("nip"));
                dokter.setNamaDokter(rs.getString("nama_dokter"));
                dokter.setAlamat(rs.getString("alamat"));
                dokter.setNoHp(rs.getString("noHp"));
                dokter.getPendaftaran().setIdPendaftaran(rs.getInt("idPendaftaran"));
                dokter.getPendaftaran().setTanggalPeriksa(rs.getString("tanggalPeriksa"));
                dokter.getPasien().setId(rs.getInt("id"));
                dokter.getPasien().setNama(rs.getString("nama"));
                dokter.getPasien().setKeluhan(rs.getString("keluhan"));

                ListDokter.add(dokter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDokter;
    }
    
    public void save() {
        if (getById(nip).getNip()== 0) {
            String SQL = "INSERT INTO dokter (nip, idPendaftaran, id, nama_dokter, alamat, noHp) VALUES("
                        + "'" + this.nip + "',"
                        + "'" + this.getPendaftaran().getIdPendaftaran() + "',"
                        + "'" + this.getPasien().getId() + "',"
                        + "'" + this.nama_dokter + "',"
                        + "'" + this.alamat + "',"
                        + "'" + this.noHp + "')";
            this.nip = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE dokter SET "
                        + "     nip = '" + this.nip + "', "
                        + "     nama_dokter = '" + this.nama_dokter + "', "
                        + "     idPendaftaran = '" + this.getPendaftaran().getIdPendaftaran() + "', "
                        + "     id = '" + this.getPasien().getId() + "', "
                        + "     alamat = '" + this.alamat + "', "
                        + "     noHp = '" + this.noHp + "' "
                        + "     WHERE nip = '" + this.nip + "'";
            this.nip = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM dokter WHERE nip = '" + this.nip + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String toString(){
        return nama_dokter;
    }
}
