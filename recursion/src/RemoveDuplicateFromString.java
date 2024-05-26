public class RemoveDuplicateFromString {
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        String input = "jjyyootti";
        removeDuplicates(input, 0, "");
        /**
         * timeComplexity=O(n)
         */
    }

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        if (!map[currentChar - 'a']) {
            newString = newString+currentChar;
            map[currentChar - 'a'] = true;
        }
        removeDuplicates(str, idx+1, newString);
    }

}
