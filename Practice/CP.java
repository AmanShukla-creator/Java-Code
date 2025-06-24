package Practice;

public class CP {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        Solution solution = new Solution();
        String[] result = solution.findWords(words);
        for (String word : result) {
            System.out.println(word);
        }
    }
}

class Solution {
    public String[] findWords(String[] words) {
        String X = "qwertyuiop";
        String Y = "asdfghjkl";
        String Z = "zxcvbnm";
        String[] result = new String[words.length];
        int index = 0;
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (allCharsInRow(lowerWord, X) || allCharsInRow(lowerWord, Y) || allCharsInRow(lowerWord, Z)) {
                result[index++] = word;
            }
        }
        return java.util.Arrays.copyOf(result, index);
    }

    private boolean allCharsInRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
