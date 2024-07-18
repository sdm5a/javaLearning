abstract class Parent{
    
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}


public class A_Practice{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.greet();
        
    }
}