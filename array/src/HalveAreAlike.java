import java.util.ArrayList;
import java.util.List;

public class HalveAreAlike {
    public static void main(String[] args) {
        boolean response = halvesAreAlike("book");
        System.out.println(response);
    }

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int halfLength = n / 2;
        String a = s.substring(0, halfLength);
        String b = s.substring(halfLength, n);
        List<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('A');
        characters.add('e');
        characters.add('E');
        characters.add('i');
        characters.add('I');
        characters.add('o');
        characters.add('O');
        characters.add('u');
        characters.add('U');
        int vowelsCoutInA = 0;
        int vowelsCoutInB = 0;
        for (int i = 0; i < a.length(); i++) {
            if (characters.contains(a.charAt(i))) {
                vowelsCoutInA = vowelsCoutInA + 1;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (characters.contains(b.charAt(i))) {
                vowelsCoutInB = vowelsCoutInB + 1;
            }
        }

        return vowelsCoutInA == vowelsCoutInB;


    }
}
