
import java.util.Scanner;

public class B_passOrFail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks of maths: ");
        byte m1 = sc.nextByte();
        System.out.print("Enter your marks of physics: ");
        byte m2 = sc.nextByte();
        System.out.print("Enter your marks of biology: ");
        byte m3 = sc.nextByte();

        float percent = ((m1 + m2 + m3) / 3.0f);
        System.out.println("Your over all % is: " + percent);
        if (percent >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Result is pass");
        } else {
            System.out.println("You are fail");
        }
        sc.close();
    }
}
