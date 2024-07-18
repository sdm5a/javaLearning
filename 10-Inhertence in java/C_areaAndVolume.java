class Circle{
    int r;

    Circle(int r){
        this.r=r;
        // System.out.println("This is a constructor:");
    }

    public double areaOCircle(){
        return 2*Math.PI*r;
    }
}

class Cylinder extends Circle{
    int h;
    Cylinder(int h){
        super(5);
        this.h=h;
        //  System.out.println("This is a extended constructor:");
    }

    public int random(){
        return 2*(r+h);
    }

    public double volumeOfCylinder(){
        return 2*Math.PI*r*h;
    }

}
public class C_areaAndVolume{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(5);
        // Circle c1=new Circle(5);
        // System.out.println(c.random());
        // System.out.println("Area of circle: "+c1.areaOCircle());
        System.out.println("Volume of Cylinder: "+c.volumeOfCylinder());
        
    }
}