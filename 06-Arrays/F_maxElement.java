
public class F_maxElement {

    public static void main(String[] args) {
        int[] arry = {41, 6595, 48, 154, 23, 459};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        System.out.printf("The maximum number is: %d", max);
    }
}
