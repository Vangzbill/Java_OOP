package Tugas;

class Manusia{
    public void bernafas(){
        System.out.println("Manusia harus bernafas");
    }
    
    public void makan(){
        System.out.println("Manusia harus makan");
    }
}

class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen sedang makan...");
    }
    
    public void lembur(){
        System.out.println("Dosen sedang kerja lembur...");
    }
}

class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa sedang makan...");
    }
    
    public void tidur(){
        System.out.println("Mahasiswa butuh tidur...");
    }
}

public class OverridingMain {
    public static void main(String[] args) {
        Manusia manusia = new Dosen();
        manusia.bernafas();
        manusia.makan();

        System.out.println("=================");

        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();
    }
}
