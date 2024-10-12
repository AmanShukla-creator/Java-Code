package Arrays;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }

}
