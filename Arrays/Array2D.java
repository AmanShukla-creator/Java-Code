package Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] Arrays = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Arrays[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // System.out.print(Arrays[i][j] + "|2");
        // }
        // System.out.println();
        // }
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (x == Arrays[i][j]) {
                    System.out.println("x found at index" + " " + i + "," + j);
                }
            }
        }
    }
}
