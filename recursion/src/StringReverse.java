public class StringReverse {
    public static void main(String[] args) {
        String s= "abcd";
        reversedString(s.length()-1,s);
    }

    public static void reversedString(int idx, String inputString) {
        if (idx == 0) {
            System.out.println(inputString.charAt(idx));
            return;
        }
        System.out.println(inputString.charAt(idx));
        reversedString(idx - 1, inputString);
    }
}
