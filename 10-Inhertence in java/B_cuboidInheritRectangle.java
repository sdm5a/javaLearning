class Rectangle{
    int l,b;

    Rectangle(){
        System.out.println("This is a random constructor:");
    }

    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    public int areaOfRectangle(){
        return l*b;
    }
}

class Cuboid extends Rectangle{
    int h;

    Cuboid(int h){
        super(4,6);
        this.h=h;
    }

    public double volume(){
        return l*b*h;
    }
}

public class B_cuboidInheritRectangle{
    public static void main(String[] args) {
        Cuboid cb=new Cuboid(5);
        System.out.println(cb.volume());
    }
}