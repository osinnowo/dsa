class DynamicProgrammingUncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int count = 0;
        int[] dp = new int[nums2.length + 1];
        for(int i = 0; i < nums1.length; i++) {
            int prev = 0;
            for(int j = 1; j <= nums2.length; j++) {
                int current = dp[j];
                if(nums1[i] == nums2[j - 1]) {
                    dp[j] = prev + 1;
                    count = Math.max(count, dp[j]);
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = current;
            }
        }
        return count;
    }
}
