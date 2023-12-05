package percobaan7;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Sabil", "Trenggalek", "Laki-laki", 19, 3000000, 250000, 180000, "2B", 100000);
        ST.tampilStaffTetap();
        
        StaffHarian SH = new StaffHarian("Shelia", "Jombang", "Perempuan", 18, 100000, 100000, 50000, 18);
        SH.tampilStaffHarian();
    }
}
