// Function are stored in the memory in the form of stack..
package Function;

import java.util.Scanner;

public class Fuc1 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);
    }

}
