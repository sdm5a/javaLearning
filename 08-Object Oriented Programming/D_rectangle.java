
import java.util.Scanner;

class Rectangle {

    int side1, side2;

    public int perimeter() {
        return 2 * (side1 + side2);
    }

    public int area() {
        return side1 * side2;
    }
}

public class D_rectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectange: ");
        r1.side1 = sc.nextInt();
        System.out.print("Enter the breadth of rectange: ");
        r1.side2 = sc.nextInt();

        System.out.println("Total perimeter is: " + r1.perimeter());
        System.out.println("Total area is: " + r1.area());
        sc.close();
    }
}
