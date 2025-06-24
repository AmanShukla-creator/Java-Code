package Practice;

import java.util.Scanner;

public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine(); // consume the newline
            String o = sc.nextLine();

            boolean isValid = true;

            for (int j = 0; j < n; j++) {
                char currentTask = o.charAt(j);
                for (int k = j + 1; k < n; k++) {
                    if (o.charAt(k) == currentTask && o.charAt(k - 1) != currentTask) {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) {
                    break;
                }
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
