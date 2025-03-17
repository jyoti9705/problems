public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };
        int[] res = findMissingAndRepeatedValues(grid);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int n = grid.length;
        int[] nums = new int[n * n+1 ];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[grid[i][j]] == 1) {
                    res[0] = grid[i][j];
                } else {
                    nums[grid[i][j]] = 1;
                }
            }
        }

        for (int i = 1; i <= n * n+1; i++) {
            if (nums[i] == 0) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
