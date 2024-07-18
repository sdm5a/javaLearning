abstract class Pen{
    abstract public void write();
    abstract public void refill();
}

class CelloPen extends Pen{

    public void write(){
        System.out.println("Writing...");
    }

    public void refill(){
        System.out.println("Refilling...");
    }

    public void changeNib(){
        System.out.println("Changing nib...");
    }
}

public class C_creatConcreteClassOfPen {
    public static void main(String[] args) {
        CelloPen cl=new CelloPen();
        cl.changeNib();
        cl.refill();
        cl.write();
    }
}
