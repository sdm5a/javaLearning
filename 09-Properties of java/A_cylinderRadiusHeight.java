class Cylinder{
    int r,h;

    public void setR(int r){
        this.r=r;
    }

    public int getR(){
        return r;
    }

    public void setH(int h){
        this.h=h;
    }

    public int getH(){
        return h;
    }
}

public class A_cylinderRadiusHeight{
    public static void main(String[] args) {
        Cylinder cl=new Cylinder();
        cl.setR(5);
        System.out.println(cl.getR());
        cl.setH(78);
        System.out.println(cl.getH());
    }
}