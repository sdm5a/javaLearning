
import java.util.Scanner;

public class C_incomeTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("Enter your income in lacks: ");
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5) {
            tax = tax + (income - 2.5f) * 0.05f;
        } else if (income > 5 && income <= 10) {
            tax = tax + (income - 2.5f) * 0.05f;
            tax = tax + (income - 5) * 0.1f;
        } else if (income > 10) {
            tax = tax + (income - 2.5f) * 0.05f;
            tax = tax + (income - 5) * 0.1f;
            tax = tax + (income - 10) * 0.33f;
        }
        System.out.println("Total tax that you have to pay is: " + tax);
        sc.close();
    }
}
