package Loops;

public class practice {
    public static void main(String[] args) {

        // int sum = 0;
        // for (int i = 0; i <= n; i = i + 1) {

        // sum = sum + i;
        // }
        // System.out.println(sum);

        // for (int i = 1; i < 11; i++) {
        // int x = n * i;
        // System.out.println(x);

        // }
        // int i = 4;
        // int x = 5;
        // for (int i = 1; i < 5; i++) {
        // for (int x = 1; x < 6; x++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // int m = 4;
        // int n = 5;
        // for (int i = 1; i <= m; i++) {
        // for (int x = 1; x <= n; x++) {
        // if (i == 1 || i == m || x == 1 || x == n) {
        // System.out.print("*");

        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int x = 1; x <= i; x++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {

        // System.out.print(j + " ");
        // }
        // System.out.println();

        // }

    }
}
