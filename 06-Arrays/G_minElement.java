
public class G_minElement {

    public static void main(String[] args) {
        int[] arry = {41, 6595, 48, 154, 23, 459};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        System.out.printf("The minimum number is: %d", min);
    }
}
