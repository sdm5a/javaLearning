
import java.util.Scanner;

public class B_sumOfFirstNEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.printf("The sum of first %d number is: %d", n, sum);
        sc.close();
    }
}
