
public class C_calculateAverageOfElements {

    public static void main(String[] args) {
        float[] marks = {78, 89, 69, 85, 78};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.printf("The average of the element of this array is: %f", sum / marks.length);
    }
}
