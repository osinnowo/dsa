class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // Create a boolean array to store the intermediate results
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Empty string and pattern match
        dp[0][0] = true;
        
        // Deals with patterns like a* or a*b* or a*b*c*
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Process the remaining characters
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                // If characters match or pattern has a '.', continue matching
                if (sc == pc || pc == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                
                // If pattern has '*', consider the previous character and zero occurrence
                else if (pc == '*') {
                    char pPrev = p.charAt(j - 2);
                    
                    // Zero occurrence of preceding character
                    dp[i][j] = dp[i][j - 2];
                    
                    // If preceding character matches or pattern has a '.', consider the previous string
                    if (pPrev == sc || pPrev == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
}
