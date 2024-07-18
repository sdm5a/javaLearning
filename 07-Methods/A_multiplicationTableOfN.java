
import java.util.Scanner;

public class A_multiplicationTableOfN {

    public static void multiplicationOfN(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print table of it: ");
        int n = sc.nextInt();
        multiplicationOfN(n);
        sc.close();
    }
}
