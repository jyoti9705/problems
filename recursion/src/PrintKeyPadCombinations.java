public class PrintKeyPadCombinations {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        String inputStr = "23";
        printCombination(inputStr,0,"");
        /**
         * time complexity O(4^n)
         */
    }

    public static void printCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String currentMapping = keypad[currChar - '0'];
        for (int i = 0; i < currentMapping.length(); i++) {
            printCombination(str, idx + 1, combination + currentMapping.charAt(i));
        }
    }

}
