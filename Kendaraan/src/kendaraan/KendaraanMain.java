package kendaraan;

public class KendaraanMain {
    public static void main(String[] args) {
        SepedaMotor spd = new SepedaMotor();
        spd.speed = 80;
        spd.cc = 150;
        spd.color = "Red";
        spd.plat = "AG 3098 YB";
        spd.tampil();
    }
}
