
import java.util.Scanner;

public class E_leapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            if (year % 100 != 0) {
                System.out.println("This is a leap year");
            }
        } else {
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
