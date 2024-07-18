
public class G_averageOfVariousArguments {

    static int average(int... n) {
        int sum = 0;
        for (int a : n) {
            sum = sum + a;
        }
        int avg = sum / n.length;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(average(1, 2, 3));
        System.out.println(average());
    }
}
