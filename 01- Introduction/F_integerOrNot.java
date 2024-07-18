import java.util.Scanner;
public class F_integerOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer: ");
        System.out.println(sc.hasNextInt());
        sc.close();

    }
}
