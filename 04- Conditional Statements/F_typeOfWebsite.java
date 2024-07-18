
import java.util.Scanner;

public class F_typeOfWebsite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL of your Website: ");
        String website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website.");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an orgonisational website.");
        }
        sc.close();
    }
}
