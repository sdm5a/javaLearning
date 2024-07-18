
import java.util.Scanner;

public class C_recusiveToSumOfNNanuralNumber {

    static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfN(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To find sum of n natural nummber enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
        sc.close();
    }
}
