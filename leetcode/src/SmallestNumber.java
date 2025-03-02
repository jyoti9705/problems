public class SmallestNumber {
    public static void main(String[] args) {

    }

    public String smallestNumber(String pattern) {
        char[] arr = pattern.toCharArray();
        //again the constraints are small, so we can backtrack, recursion or dp
        //because we are also swapping, we can use backtracking
        boolean[] used = new boolean[10];
        int[] ans = new int[arr.length + 1];
        for (int i = 1; i <= 9; i++) {
            ans[0] = i;
            used[i] = true;
            if (backtrack(i, pattern.length(), ans, used, arr)) {
                return getAnswer(ans);
            }
            ans[0] = 0;
            used[i] = false;
        }
        return getAnswer(ans);


    }

    private String getAnswer(int[] ans) {
        StringBuilder sb = new StringBuilder();
        for (int a : ans)
            sb.append(a);
        return sb.toString();
    }

    private boolean backtrack(int idx, int length, int[] ans, boolean[] used, char[] arr) {
        if (idx == length) {
            return true;
        }
        if (arr[idx] == 'I') {
            for (int i = ans[idx] + 1; i <= 9; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                ans[idx + 1] = i;
                if (backtrack(idx + 1, length, ans, used, arr)) {
                    return true;
                }
                used[i] = false;
                ans[idx + 1] = 0;
            }
        }else {
            for (int i=1;i<ans[idx];i++){
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                ans[idx + 1] = i;
                if (backtrack(idx + 1, length, ans, used, arr)) {
                    return true;
                }
                used[i] = false;
                ans[idx + 1] = 0;
            }
        }
        return false;
    }
}

   

