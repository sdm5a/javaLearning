
public class A_sumOfElementsOfArray {

    public static void main(String[] args) {
        float[] marks = {55, 56, 57, 58, 59};
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.printf("The total sum of the elements of array is: %f", sum);
        // for (int element : marks) {
        //     System.out.println(element);
        // }
    }
}
