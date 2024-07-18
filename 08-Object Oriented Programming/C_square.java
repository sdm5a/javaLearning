
import java.util.Scanner;

class Square {

    // int n;
    void perimeter(int n) {
        System.out.println("Total perimeter of this square is: " + 4 * n);
    }

    void area(int n) {
        System.out.printf("Area of this square is: " + n * n);
    }

}

public class C_square {

    public static void main(String[] args) {
        Square s1 = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int n = sc.nextInt();
        s1.perimeter(n);
        s1.area(n);
        sc.close();

    }
}
