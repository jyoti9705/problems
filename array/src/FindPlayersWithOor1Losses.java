import java.util.*;

public class FindPlayersWithOor1Losses {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> noOfLosses = new HashMap<>();
        for (int[] match : matches
        ) {
            if (noOfLosses.containsKey(match[0])) {
                noOfLosses.put(match[0], noOfLosses.getOrDefault(match[0], 0) + 0);
            } else {
                noOfLosses.put(match[0], 0);
            }

            if (noOfLosses.containsKey(match[1])) {
                noOfLosses.put(match[1], noOfLosses.getOrDefault(match[1], 0) + 1);
            } else {
                noOfLosses.put(match[1], 1);
            }

        }

        List<Integer> notLostAnyMatch = new ArrayList<>();
        List<Integer> lostOneMatch = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : noOfLosses.entrySet()
        ) {
            if (entry.getValue() == 0) {
                notLostAnyMatch.add(entry.getKey());
            }
            if (entry.getValue() == 1) {
                lostOneMatch.add(entry.getKey());
            }

        }
        results.add(notLostAnyMatch);
        results.add(lostOneMatch);
        Collections.sort(results.get(0));
        Collections.sort(results.get(1));
        return results;
    }
}
