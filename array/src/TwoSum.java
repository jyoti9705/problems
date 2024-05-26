import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] response = twoSum(array, target);
        System.out.println(response.toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                return new int[]{map.get(number), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
