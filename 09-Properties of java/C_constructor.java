class Cylinder{
    int r,h;
    public Cylinder(int x,int y){
        this.r=x;
        this.h=y;
    }

    public int getH(){
        return h;
    }

    public int getR(){
        return r;
    }

}
public class C_constructor {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(4, 5);
        System.out.println(c.getH());
        System.out.println(c.getR());
    }
}
