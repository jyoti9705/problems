import java.util.Arrays;

public class CherryPickUp2 {
    public static void main(String[] args) {

    }

    public int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[][][] dp = new int[r][c][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        dfs(0, 0, c - 1, dp, grid);
        return dp[0][0][c - 1];
    }

    private int dfs(int r, int c1, int c2, int[][][] dp, int[][] grid) {

        if (r >= grid.length || c1 < 0 || c1 >= grid[0].length || c2 < 0 || c2 >= grid[0].length) {
            return 0;
        }
        if (dp[r][c1][c2] != -1) {
            return dp[r][c1][c2];
        }
        int result = 0;
        if (r < grid.length) {
            result = result + grid[r][c1];
            if (c1 != c2) {
                result = result + grid[r][c2];
            }
            int max = 0;
            for (int i = c1 - 1; i <= c1 + 1; i++) {
                for (int j = c2 - 1; j <= c2 + 1; j++) {

                    max = Math.max(max, dfs(r + 1, i, j, dp, grid));
                }
            }
            result = result + max;
            dp[r][c1][c2] = result;
        }
        return result;
    }
}
