public class ClearDigits {

    public static void main(String[] args) {
        String test = "abc";
        String test1 = "cb34";
        System.out.println(clearDigits(test));
        System.out.println(clearDigits(test1));
    }

    public static String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else {
                res.append(c);
            }

        }

        return res.toString();
    }
}
