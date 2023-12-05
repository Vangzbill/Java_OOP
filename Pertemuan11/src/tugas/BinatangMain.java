package tugas;

public class BinatangMain {
    public static void main(String[] args) {
        Keledai k = new Keledai("Donkey", 4, "Iaww-Iaww", "Abu-Abu");
        Gorilla g = new Gorilla("Gundam", 4, "Haum-Haum", "Hitam");
        Singa s = new Singa("Simba", 4, "Meong-Meong", "Orange");
        
        k.displayData();
        g.displayData();
        s.displayData();
    }
}
