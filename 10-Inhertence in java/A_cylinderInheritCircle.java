class Circle{
    int r;

    Circle(int r){
        this.r=r;
        System.out.println("This is a constructor:");
    }
}

class Cylinder extends Circle{
    int h;
    Cylinder(int h){
        super(5);
        this.h=h;
         System.out.println("This is a extended constructor:");
    }

    public int random(){
        return 2*(r+h);
    }

}
public class A_cylinderInheritCircle{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(5);
        System.out.println(c.random());
        
    }
}