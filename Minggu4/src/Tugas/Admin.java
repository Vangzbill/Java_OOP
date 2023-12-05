package Tugas;

public class Admin {
    private String id;
    private String nama;
    
    Admin(){
        
    }
    
    Admin(String id, String nama){
        this.nama = nama;
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String nama(){
        return nama;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void info(){
        System.out.println("Id admin : " +id);
        System.out.println("Nama admin : " +nama);
    }
}
