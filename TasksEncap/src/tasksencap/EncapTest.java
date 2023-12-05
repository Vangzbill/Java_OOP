package tasksencap;

public class EncapTest {
    public static void main(String[] args){
        EncapDemo encap = new EncapDemo();
        encap.setName("Sabil");
        encap.setAge(11);
        
        System.out.println("Name : " +encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
