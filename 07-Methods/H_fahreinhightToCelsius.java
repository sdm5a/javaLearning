
import java.util.Scanner;

public class H_fahreinhightToCelsius {

    static int cToF(int c) {
        return (9 / 5) * c + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of temprature in celsius: ");
        int c = sc.nextInt();
        System.out.println("In fhrienhight: " + cToF(c));
        sc.close();

    }
}
