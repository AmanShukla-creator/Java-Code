import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        double area = 3.14 * (radius) * (radius);
        System.out.println(area);
    }
}