import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOpsReqToMakeAnArrayEmpty {
    public static void main(String[] args) {

    }

    public static int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getValue();
            if (number == 1) {
                return -1;
            }
            if (number % 3 == 0) {
                ans = ans + (number / 3);
            }
            if (number % 3 != 0) {
                ans = ans + 1;
            }
        }
        return ans;
    }
}
