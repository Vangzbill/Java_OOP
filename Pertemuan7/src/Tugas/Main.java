package Tugas;

public class Main {
    public static void main(String[] args) {
        Windows w = new Windows("Acer", 4, 1024, "Intel Core i5", "Lion", "Cortana");
        w.tampilWindows();
        
        Mac m = new Mac("Macbook Pro", 6, 1024, "Ryzen 5", "Lithium-ion", "Mac Security");
        m.tampilMac();
        
        PC pc = new PC("ROG", 8, 1024, "Intel Core i9", 15);
        pc.tampilPC();
    }
}
