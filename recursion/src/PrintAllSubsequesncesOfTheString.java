public class PrintAllSubsequesncesOfTheString {
    public static void main(String[] args) {

        String inputString = "abc";
        printSub("", inputString, 0);
        /**
         * time complexity
         * O(2^n)
         * every element has 2 choices and there are 2 elements.
         */
    }

    public static void printSub(String newString, String inputString, int idx) {
        if (idx == inputString.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = inputString.charAt(idx);

        //to be
        printSub(newString + currChar, inputString, idx + 1);

        //not to be
        printSub(newString, inputString, idx + 1);
    }
}
