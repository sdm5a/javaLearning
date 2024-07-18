
class Vikky {

    public void run() {
        System.out.println("Runnig....");
    }

    public void hit() {
        System.out.println("Hiting.....");
    }

    public void fire() {
        System.out.println("Firing.....");
    }
}

public class E_rockstarGames {

    public static void main(String[] args) {
        Vikky player1 = new Vikky();

        player1.hit();
        player1.fire();
        player1.run();
    }
}
