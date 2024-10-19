package Strings;

public class Strings1 {
    public static void main(String[] args) {
        // String decleration
        String name = "Aman";
        String Class = "B.tech";
        String Age = "18";
        // concatenation
        String all = name + " " + Class + " " + Age;
        System.out.println(all.length());
        for (int i = 0; i < all.length(); i++) {
            System.out.println(all.charAt(i));
        }
    }

}
