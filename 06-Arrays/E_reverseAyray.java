
public class E_reverseAyray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.printf(" %d", arr[j]);
        }
    }
}
