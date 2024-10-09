package Function;

import java.util.Scanner;

public class Fuc2 {
    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum(a, b);
        System.out.println("Sum of two number :" + sum);
    }

}
