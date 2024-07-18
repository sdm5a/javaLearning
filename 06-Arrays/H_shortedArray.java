
public class H_shortedArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 38, 4, 5, 6, 7, 8, 9};
        boolean n = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                n = true;
            } else {
                n = false;
            }
        }
        if (n) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
