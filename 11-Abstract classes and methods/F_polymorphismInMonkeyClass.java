class Monkey{
    public void jump(){
        System.out.println("Monkey is Jumping now.");
    }

    public void bite(){
        System.out.println("Monkey can bite...");
    }
}

interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Animals will eat...");
    }

    public void sleep(){
        System.out.println("Animals will sleep...");
    }

}

public class F_polymorphismInMonkeyClass {
    public static void main(String[] args) {
        Monkey hm=new Human();
        hm.bite();
        // hm.sleep(); these functions are not present in monkey class
        // hm.eat();
        hm.jump();
    }
}
