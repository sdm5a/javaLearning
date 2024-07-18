
import java.util.Scanner;

class Circle {

    float r;

    public float circumfrence() {
        return 2 * 1.732f * r;
    }

    public float area() {
        return 2 * 1.732f * r * r;
    }
}

public class F_circle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        c1.r = sc.nextFloat();
        System.out.println("Circumference is: " + c1.circumfrence());
        System.out.println("Area of thr circle is: " + c1.area());
        sc.close();

    }
}
