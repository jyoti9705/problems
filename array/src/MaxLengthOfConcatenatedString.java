import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLengthOfConcatenatedString {
    public static void main(String[] args) {

    }

    public int maxLength(List<String> arr) {
        Set<Integer> lengths = new HashSet<>();
        for (String s : arr
        ) {
            boolean uniqueChar = isUniqueChar(s);

            if (uniqueChar) {
                lengths.add(s.length());
            }

        }

        for (int i = 0; i < arr.size(); i++) {
            boolean unique = true;
            Set<Character> elements = new HashSet<>();
            for (int j = i + 1; j < arr.size(); j++) {
                for (Character c : arr.get(i).toCharArray()
                ) {
                    if (!elements.add(c)) {
                        unique = false;
                    }

                }

                for (Character c : arr.get(j).toCharArray()
                ) {
                    if (!elements.add(c)) {
                        unique = false;
                    }

                }

                if (unique) {
                    lengths.add((arr.get(i).length() + arr.get(j).length()));
                }
            }
        }

        return lengths.stream().mapToInt(Integer::intValue).max().getAsInt();

    }

    private boolean isUniqueChar(String s) {
        boolean uniqueChar = true;
        Set<Character> uniqueChars = new HashSet<>();
        for (Character c : s.toCharArray()
        ) {
            if (!uniqueChars.add(c)) {
                uniqueChar = false;
            }


        }
        return uniqueChar;
    }
}
