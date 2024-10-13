//  Transpose of a matrix

package Arrays;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of matrix is");
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
