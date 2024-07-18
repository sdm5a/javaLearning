import java.util.Scanner;
public class D_greet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" Good Morning!");
        sc.close();
    }
}