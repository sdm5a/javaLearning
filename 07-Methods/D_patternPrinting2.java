
import java.util.Scanner;

public class D_patternPrinting2 {

    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern2(n);
        sc.close();
    }
}
