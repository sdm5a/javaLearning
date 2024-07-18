
import java.util.Scanner;

public class E_fibonacciSeries {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number to print nth term of fibonacci series: ");
        int n = sc.nextInt();
        System.out.print(fibonacci(n));
        sc.close();
    }
}
