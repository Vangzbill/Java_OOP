package minggu12;

public class Manusia {
    public void nyalakanPerangkat(Elektronik el){
        if(el instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input : " + ((TelevisiJadul)el).getModelInput());
        }else if(el instanceof TelevisiModern){
            System.out.println("Nyalakan televisi modern dengan input :" + ((TelevisiModern)el).getModelInput());
        }
        System.out.println("Voltase Televisi : " + el.getVoltase());
    }
}
