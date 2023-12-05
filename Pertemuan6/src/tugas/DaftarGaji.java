package tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    
    DaftarGaji(int jumlah){
        listPegawai = new Pegawai[jumlah];
    }
    
    public void AddPegawai(Pegawai pegawai){
        for(int i = 0; i < listPegawai.length; i++){
            if(listPegawai[i] == null){
                listPegawai[i] = pegawai;
                break;
            }
        } 
    }
    
    public void printSemuaGaji(){
        System.out.println("<<<<DATA GAJI PEGAWAI>>>>");
        System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>>");
        for(int i=0; i < listPegawai.length; i++){
            System.out.println("Nama : " + listPegawai[i].nama);
            System.out.println("Gaji : " + listPegawai[i].getGaji());
            System.out.println("=====================");
        }
    }
}
