class Rectangle{
    public Rectangle() {
        
        System.out.println("This is a constructor:");
    }

    public Rectangle(int x){
        
        System.out.println("this is overloded constuctor:");
    }
}
public class D_overloadAConstructor{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Rectangle r1=new Rectangle(5);
    }
}