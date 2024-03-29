package backend;
import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota=new Anggota();
    private Buku buku=new Buku();
    private String tanggalpinjam,tanggalkembali;
    
    public Peminjaman() {
    }
    
    public Peminjaman(Anggota anggota,Buku buku,String tanggalpinjam, String tanggalkembali) {
        this.anggota=anggota;
        this.buku=buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    public int getIdpeminjaman() {
        return idpeminjaman;
    }
    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
   }
    public Buku getBuku() {
        return buku;
    }
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    public Anggota getAnggota() {
        return anggota;
    }
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    public String getTanggalpinjam() {
        return tanggalpinjam;
    }
   public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }
    public String getTanggalkembali() {
        return tanggalkembali;
    }
    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }
    public Peminjaman getById(int id){
        Peminjaman p=new Peminjaman();
        ResultSet rs=DBHelper.selectQuery("SELECT "
        +" p.idpeminjaman as idpeminjaman, "
        +" a.idanggota as idanggota, "
        +" a.nama as nama, "
        +" a.alamat as alamat, "
        +" a.telepon as telepon, "
        +" b.idbuku as idbuku, "
        +" b.idkategori as idkategori, "
        +" b.judul as judul, "
        +" b.penerbit as penerbit, "
        +" b.penulis as penulis, "
        +" p.tanggalpinjam as tanggalpinjam, "
        +" p.tanggalkembali as tanggalkembali "
        +" FROM peminjaman p "
        +" LEFT JOIN anggota a on p.idanggota=a.idanggota"
        +" LEFT JOIN buku b on p.idbuku=b.idbuku "
        +" WHERE p.idpeminjaman = '"+id+"'");
        try{
            while(rs.next()){
                p=new Peminjaman();
                p.setIdpeminjaman(rs.getInt("idpeminjaman"));
                p.setTanggalpinjam(rs.getString("tanggalpinjam"));
                p.setTanggalkembali(rs.getString("tanggalkembali"));
                p.getAnggota().setIdanggota(rs.getInt("idanggota"));
                p.getAnggota().setNama(rs.getString("nama"));
                p.getAnggota().setAlamat(rs.getString("alamat"));
                p.getAnggota().setTelepon(rs.getString("telepon"));
                p.getBuku().setIdBuku(rs.getInt("idbuku"));
                p.getBuku().setJudul(rs.getString("judul"));
                p.getBuku().setPenerbit(rs.getString("penerbit"));
                p.getBuku().setPenulis(rs.getString("penulis"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return p;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman>ListPeminjaman=new ArrayList();
        ResultSet rs=DBHelper.selectQuery("SELECT "
        +" p.idpeminjaman as idpeminjaman, "
        +" a.idanggota as idanggota, "
        +" a.nama as nama, "
        +" a.alamat as alamat, "
        +" a.telepon as telepon, "
        +" b.idbuku as idbuku, "
        +" b.idkategori as idkategori, "
        +" b.judul as judul, "
        +" b.penerbit as penerbit, "
        +" b.penulis as penulis, "
        +" p.tanggalpinjam as tanggalpinjam, "
        +" p.tanggalkembali as tanggalkembali "
        +" FROM peminjaman p "
        +" LEFT JOIN anggota a on p.idanggota=a.idanggota"
        +" LEFT JOIN buku b on p.idbuku=b.idbuku ");
        try{
            while(rs.next()){
                Peminjaman p=new Peminjaman();
                p.setIdpeminjaman(rs.getInt("idpeminjaman"));
                p.setTanggalpinjam(rs.getString("tanggalpinjam"));
                p.setTanggalkembali(rs.getString("tanggalkembali"));
                p.getAnggota().setIdanggota(rs.getInt("idanggota"));
                p.getAnggota().setNama(rs.getString("nama"));
                p.getAnggota().setAlamat(rs.getString("alamat"));
                p.getAnggota().setTelepon(rs.getString("telepon"));
                p.getBuku().setIdBuku(rs.getInt("idbuku"));
                p.getBuku().setJudul(rs.getString("judul"));
                p.getBuku().setPenerbit(rs.getString("penerbit"));
                p.getBuku().setPenulis(rs.getString("penulis"));
                ListPeminjaman.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman> search3(String keyword){
        ArrayList<Peminjaman>ListPeminjaman=new ArrayList();
        ResultSet rs=DBHelper.selectQuery("SELECT "
        +" b.idbuku as idbuku "
        +" FROM peminjaman p "
        +" LEFT JOIN anggota a on p.idanggota=a.idanggota"
        +" LEFT JOIN buku b on p.idbuku=b.idbuku "
        +" WHERE a.idbuku LIKE '%"+keyword+"%' ");
        try{
            while(rs.next()){
                Peminjaman pmj=new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pmj.setTanggalkembali(rs.getString("tanggalkembali"));
                pmj.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pmj.getAnggota().setNama(rs.getString("nama"));
                pmj.getAnggota().setAlamat(rs.getString("alamat"));
                pmj.getAnggota().setTelepon(rs.getString("telepon"));
                pmj.getBuku().setIdBuku(rs.getInt("idbuku"));
                pmj.getBuku().setJudul(rs.getString("judul"));
                pmj.getBuku().setPenerbit(rs.getString("penerbit"));
                pmj.getBuku().setPenulis(rs.getString("penulis"));
        
                ListPeminjaman.add(pmj);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            return ListPeminjaman;
        }
    
        public ArrayList<Peminjaman> search(String keyword){
            ArrayList<Peminjaman>ListPeminjaman=new ArrayList();
            ResultSet rs=DBHelper.selectQuery("SELECT "
                        +" p.idpeminjaman as idpeminjaman, "
                        +" a.idanggota as idanggota, "
                        +" a.nama as nama, "
                        +" a.alamat as alamat, "
                        +" a.telepon as telepon, "
                        +" b.idbuku as idbuku, "
                        +" b.idkategori as idkategori, "
                        +" b.judul as judul, "
                        +" b.penerbit as penerbit, "
                        +" b.penulis as penulis, "
                        +" p.tanggalpinjam as tanggalpinjam, "
                        +" p.tanggalkembali as tanggalkembali "
                        +" FROM peminjaman p "
                        +" LEFT JOIN anggota a on p.idanggota=a.idanggota"
                        +" LEFT JOIN buku b on p.idbuku=b.idbuku "
                        +" WHERE a.nama LIKE '%"+keyword+"%' "
                        +" or b.judul LIKE '%"+keyword+"%' "
                        +" or p.tanggalpinjam LIKE '%"+keyword+"%' "
                        +" or p.tanggalkembali LIKE '%"+keyword+"%' ");
            try{
                while(rs.next()){
                    Peminjaman p=new Peminjaman();
                    p.setIdpeminjaman(rs.getInt("idpeminjaman"));
                    p.setTanggalpinjam(rs.getString("tanggalpinjam"));
                    p.setTanggalkembali(rs.getString("tanggalkembali"));
                    p.getAnggota().setIdanggota(rs.getInt("idanggota"));
                    p.getAnggota().setNama(rs.getString("nama"));
                    p.getAnggota().setAlamat(rs.getString("alamat"));
                    p.getAnggota().setTelepon(rs.getString("telepon"));
                    p.getBuku().setIdBuku(rs.getInt("idbuku"));
                    p.getBuku().setJudul(rs.getString("judul"));
                    p.getBuku().setPenerbit(rs.getString("penerbit"));
                    p.getBuku().setPenulis(rs.getString("penulis"));
                    ListPeminjaman.add(p);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return ListPeminjaman;
    }
        
    public void save(){
        if(getById(idpeminjaman).getIdpeminjaman()==0){
            String SQL="INSERT INTO peminjaman(idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
            +" '"+this.getAnggota().getIdanggota()+"', "
            +" '"+this.getBuku().getIdBuku()+"', "
            +" '"+this.tanggalpinjam+"', "
            +" '"+this.tanggalkembali+"' "
            +" )";
            this.idpeminjaman=DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL="UPDATE peminjaman SET "
            +" idanggota = '"+this.getAnggota().getIdanggota()+"', "
            +" idbuku = '"+this.getBuku().getIdBuku()+"', "
            +" tanggalpinjam = '"+this.tanggalpinjam+"', "
            +" tanggalkembali = '"+this.tanggalkembali+"' "
            +" WHERE idpeminjaman = '"+this.idpeminjaman+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL="DELETE FROM peminjaman WHERE idpeminjaman = '"+this.idpeminjaman+"'";
        DBHelper.executeQuery(SQL);
    }

}
