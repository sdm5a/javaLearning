class Cylinder{
    int r,h;
    public Cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }

    public double volume(){
        return Math.PI*r*r*h;
    }

    public double surfaceArea(){
        return 2*Math.PI*r*(h+r);
    }
}
public class B_surfaceAreaVolumeOfCylinder{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(7, 8);
        System.out.println("The volume of Cylinder is "+c.volume());
        System.out.println("The surface area of Cylinder is "+c.surfaceArea());
    }
}