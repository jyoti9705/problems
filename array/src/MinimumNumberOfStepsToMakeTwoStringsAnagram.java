import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        minSteps(s, t);
    }

    public static int minSteps(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int number = 0;
        for (Map.Entry<Character, Integer> entry : smap.entrySet()) {
            if (tmap.containsKey(entry.getKey()) && entry.getValue() <= tmap.get(entry.getKey())) {
                continue;
            } else if (tmap.containsKey(entry.getKey()) && entry.getValue() > tmap.get(entry.getKey())) {
                number = number + (  entry.getValue()-tmap.get(entry.getKey()));
            } else {
                number = number + 1;
            }
        }
        return number;
    }
}
