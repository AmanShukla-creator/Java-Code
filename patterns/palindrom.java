package patterns;

public class palindrom {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}
