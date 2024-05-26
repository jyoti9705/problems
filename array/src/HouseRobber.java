import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int[] ot = new int[101];
        int n = nums.length;
        Arrays.fill(ot, -1);
        return solve(nums, 0, n, ot);
    }

    public int solve(int[] nums, int i, int n, int[] ot) {
        if (i >= n) {
            return 0;
        }
        if (ot[i] != -1) {
            return ot[i];
        }
        int steal;
        int skip;
        steal = nums[i] + solve(nums, i + 2, n, ot);
        skip = solve(nums, i + 1, n, ot);
        ot[i] = Math.max(steal, skip);
        return ot[i];

    }

}
