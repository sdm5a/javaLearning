
public class F_sumOfMultiplicationOf8 {

    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i * n;
        }
        System.out.printf("The total sum is %d", sum);
    }
}
