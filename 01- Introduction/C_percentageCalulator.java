import java.util.Scanner;
public class C_percentageCalulator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of subject engish: ");
        float m1= sc.nextInt();
        System.out.println("Enter the marks of maths: ");
        float m2=sc.nextInt();
        System.out.println("Enter the marks of science: ");
        float m3=sc.nextInt();
        System.out.println("Enter the marks of hindi: ");
        float m4=sc.nextInt();
        System.out.println("Enter the marks of sst: ");
        float m5=sc.nextInt();
        float sum=m1+m2+m3+m4+m5;
        System.out.println("The percentage of the marks is:"+((sum/500)*100));
        sc.close();
    }
    
}
