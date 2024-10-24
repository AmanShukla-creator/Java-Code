package BitManipulation;

public class Bit2 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int BitMask = 1 << pos;
        int not = ~(BitMask);
        int number = not & n;
        System.out.println(number);
    }
}
