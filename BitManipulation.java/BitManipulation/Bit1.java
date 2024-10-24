package BitManipulation;

import java.util.Scanner;

public class Bit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 5 || 0101 --->
        int pos = sc.nextInt();
        int BITMASK = 1 << pos;
        // when operation is done through AND
        // if ((BITMASK & n) == 0) {
        // System.out.println("Bit was 0");
        // } else {
        // System.out.println("Bit was 1");
        // }
        if ((BITMASK | n) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }

    }
}