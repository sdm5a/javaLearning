
import java.util.Scanner;

public class B_givenIntergerPresentOrNotInArray {

    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to search in array: ");
        int n = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == n) {
                System.out.printf("The given number is present in this arryay at %dth position.", i);
            }
        }
        sc.close();
    }
}
