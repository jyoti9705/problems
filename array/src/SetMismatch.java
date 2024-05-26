import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SetMismatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int[] result = new int[2];
        for (Map.Entry<Integer, Long> entry : map.entrySet()
        ) {
            if (entry.getValue() > 1) {
                result[0] = entry.getKey();
                break;
            }

        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                continue;
            } else {
                result[1] = i;
            }
        }
        return result;


    }
}
