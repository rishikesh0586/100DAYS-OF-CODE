class Solution {
    public int LongestRepeatingSubsequence(String str) {
        int n = str.length();
        
        // Create a 2D array to store the lengths of repeating subsequences
        int[][] dp = new int[n + 1][n + 1];
        
        // Fill the dp array using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters at the current positions are equal and the positions are not the same
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // The length of the longest repeating subsequence will be stored at dp[n][n]
        return dp[n][n];
    }
}
