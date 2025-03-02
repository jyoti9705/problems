public class ApplyOperationsToAnArray2460 {
    public static void main(String[] args) {
        //int[] nums = {1,2,2,1,1,0};
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] ans = applyOperations(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] applyOperations(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int[] ans = new int[nums.length];
        int j = 0;

        for (int num : nums) {
            if (num != 0) {
                ans[j++] = num;
            }
        }
        return ans;
    }
}
