 abstract class Phone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnet();
}

class SmartPhone extends Phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Pickup the phone...");
    }
    public void disconnet(){
        System.out.println("Disconnecting...");
    }

    public void playMusic(){
        System.out.println("Music is playing now...");
    }

}

public class E_abstractWithPolymorphism {
    public static void main(String[] args) {
        Phone p=new SmartPhone();
        // p.playMusic();
        p.ring();
        p.lift();
        p.disconnet();
    }
    
}
