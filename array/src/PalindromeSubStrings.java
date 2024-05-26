public class PalindromeSubStrings {
    public static void main(String[] args) {

    }

    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];
        int count = 0;

        for (int L = 1; L <= n; L++) {
            for (int i = 0; i + L - 1 < n; i++) {
                int j = i + L - 1;
                if (i == j) {
                    t[i][j] = true;
                } else {
                    boolean b = s.charAt(i) == s.charAt(j);
                    if (i + 1 == j) {
                        t[i][j] = b;
                    } else {
                        t[i][j] = (b && t[i + 1][j - 1]);
                    }
                }
                if (t[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
