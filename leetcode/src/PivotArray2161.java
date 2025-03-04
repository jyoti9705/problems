public class PivotArray2161 {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] ans = pivotArray(nums, pivot);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int j = 0;

        for (int num : nums) {
            if (num < pivot) {
                ans[j++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                ans[j++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                ans[j++] = num;
            }
        }
        return ans;
    }



}
