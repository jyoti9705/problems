import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[2501][2501];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return solve(dp, 0, -1, nums);

    }

    int solve(int[][] dp, int i, int p, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        int skip = 0;
        int take = 0;
        if (p != -1 && dp[i][p] != -1) {
            return dp[i][p];
        }
        if (p == -1 || nums[p] < nums[i]) {
            take = 1 + solve(dp, i + 1, i, nums);
        }
        skip = solve(dp, i + 1, p, nums);
        if(p!=-1){
            dp[i][p] = Math.max(take, skip);
        }

        return Math.max(take, skip);
    }
}
