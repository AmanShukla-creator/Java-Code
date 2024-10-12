package Arrays;

public class FirstArray {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 90;
        marks[2] = 98;
        marks[3] = 95;
        ; // System.out.println(marks)------>this will print garbage value

        for (int i = 0; i < 4; i++) {
            System.out.println(marks[i]);
        }
    }
}
