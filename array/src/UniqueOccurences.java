import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueOccurences {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> mapAndCount = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Long> counts = new HashSet<>();
        for (Map.Entry<Integer, Long> entry : mapAndCount.entrySet()
        ) {

            boolean entrySuccess = counts.add(entry.getValue());
            if (!entrySuccess) {
                return false;
            }
        }

        return true;


    }
}
