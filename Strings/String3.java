package Strings;

public class String3 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Aman");

        // st.setCharAt(0, 'N');
        // st.insert(1, 'a');
        // st.delete(0, 1);
        // st.append("m");
        // st.append("a");
        // st.append("n");
        for (int i = 0; i < st.length() / 2; i++) {
            int front = i;
            int back = st.length() - i - 1;
            char fronton = st.charAt(front);
            char backton = st.charAt(back);
            st.setCharAt(front, backton);
            st.setCharAt(back, fronton);

        }
        System.out.println(st);

    }
}