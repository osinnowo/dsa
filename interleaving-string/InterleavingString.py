class InterleavingString:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        # Check if the lengths of s1, s2, and s3 are consistent
        if len(s1) + len(s2) != len(s3):
            return False
        
        # Create a dynamic programming table to store intermediate results
        dp = [[False] * (len(s2) + 1) for _ in range(len(s1) + 1)]
        
        # Base case: if s1 and s2 are empty, then s3 is empty as well
        dp[0][0] = True
        
        # Check if s1 can be interleaved with s3
        for i in range(1, len(s1) + 1):
            if s1[i - 1] == s3[i - 1] and dp[i - 1][0]:
                dp[i][0] = True
        
        # Check if s2 can be interleaved with s3
        for j in range(1, len(s2) + 1):
            if s2[j - 1] == s3[j - 1] and dp[0][j - 1]:
                dp[0][j] = True
        
        # Check if s1 and s2 can be interleaved with s3
        for i in range(1, len(s1) + 1):
            for j in range(1, len(s2) + 1):
                if (s1[i - 1] == s3[i + j - 1] and dp[i - 1][j]) or \
                   (s2[j - 1] == s3[i + j - 1] and dp[i][j - 1]):
                    dp[i][j] = True
        
        return dp[-1][-1]
