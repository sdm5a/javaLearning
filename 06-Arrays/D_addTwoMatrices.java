
public class D_addTwoMatrices {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {1, 2, 3}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The resultant matrix is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
