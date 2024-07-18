import java.util.Scanner;
public class E_kilometerToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values in kilometer: ");
        float k=sc.nextFloat();
        double m=k*0.62137119;
        System.out.print("In "+k+" kilometer we have "+m+" miles");
        sc.close();     
    }
}
