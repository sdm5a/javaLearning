
import java.util.Scanner;

public class D_dayOfTheWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        byte dayNumber = sc.nextByte();
        switch (dayNumber) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
            default:
                System.out.println("Please enter a valid day number between 1 to 7.");
        }
        sc.close();
    }
}
