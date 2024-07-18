interface TvRemote{
    public void play();
    public void stop();
}

interface SmartTvRemote extends TvRemote{
    public void turnOnAC();
    public void volume();
}

class Remote implements SmartTvRemote{
    public void turnOnAC(){
        System.out.println("Turning AC on...");
    }
    public void volume(){
        System.out.println("Changing volume...");
    }

    public void play(){
        System.out.println("Player started...");
    }
    public void stop(){
        System.out.println("Pause...");
    }

}

public class G_interfaceInherintence {
    public static void main(String[] args) {
        TvRemote t=new Remote();
        t.play();
        t.stop();
        // t.volume();
    }
}
