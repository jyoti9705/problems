import java.util.HashMap;

public class ArithmeticSeries2 {
    public static void main(String[] args) {


    }

    public static int numberOfArithmeticSlices(int[] nums) {
        int totalCount = 0;
        int size = nums.length;
        HashMap<Long, Integer>[] dp = new HashMap[size];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = new HashMap<>();
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; i < i; j++) {
                long diff = nums[j] - nums[i];
                if (diff < Integer.MIN_VALUE || diff > Integer.MAX_VALUE) {
                    continue;
                }

                int count = dp[j].containsKey(diff) ? dp[j].get(diff) : 0;
                totalCount = totalCount + count;
                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + count + 1);
            }
        }
        return totalCount;

    }
}
