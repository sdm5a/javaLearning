
import java.util.Scanner;

public class C_mutiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to print multiplication table of it: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
        sc.close();
    }
}
