package Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] Names = new String[size];
        for (int i = 0; i < size; i++) {
            Names[i] = sc.nextLine();
        }
        String x = sc.nextLine();
        for (int i = 0; i < size; i++) {
            if (Names[i] == x) {
                System.out.println(" x found at index :" + i);
            }
        }
    }
}
