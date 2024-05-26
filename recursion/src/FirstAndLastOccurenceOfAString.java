public class FirstAndLastOccurenceOfAString {
    public static int FIRST = -1;
    public static int LAST = -1;

    public static void main(String[] args) {
        String s = "aaaaavvvvaee";
        firtAndLastOccur('a', 0, s);
    }

    public static void firtAndLastOccur(char element, int idx, String string) {
        if (idx == string.length()) {
            System.out.println("First and Last are " + FIRST + " " + LAST);
            return;
        }
        if (element == string.charAt(idx)) {
            if (FIRST == -1) {
                FIRST = idx;
            } else {
                LAST = idx;
            }
        }
        firtAndLastOccur(element, idx+1, string);


    }
}
