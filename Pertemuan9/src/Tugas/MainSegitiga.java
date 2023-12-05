package Tugas;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Total Sudut yang belum dicari : " +sg.totalSudut(45));
        System.out.println("Total Sudut yang belum dicari : " +sg.totalSudut(60, 45));
        System.out.println("Keliling : " +sg.keliling(10, 20, 12));
        System.out.printf("Keliling : %.2f\n" ,sg.keliling(10, 8));
    }
}
