package Strings;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        // String name = "Aman";
        // String name1 = "Aman";
        // if (name.compareTo(name1) == 0) {
        // System.out.println("Strings are Equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int number = sc.nextInt();
        // int number1 = a + b;
        // System.out.println("Given number is : " + number);
        // System.out.println("Given Sum of digits is :" + number1);
        int size = 3;
        int[] Arrays = new int[size];
        for (int i = 0; i < size; i++) {
            Arrays[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int sum = Arrays[0] + Arrays[i];
            System.out.println(sum);
        }
    }
}
