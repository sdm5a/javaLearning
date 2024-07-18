
class Cellphone {

    void ring() {
        System.out.println("Cellphone is ringing......");
    }

    void call() {
        System.out.println("Cellphone is calling.....");
    }

    void vibrate() {
        System.out.println("Cellphone is vibrating.....");
    }
}

public class B_cellphoneMethods {

    public static void main(String[] args) {
        Cellphone redmi = new Cellphone();
        redmi.call();
        redmi.ring();
        redmi.vibrate();
    }
}
