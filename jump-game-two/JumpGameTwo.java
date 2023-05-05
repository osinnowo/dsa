class JumpGameTwo {
    public int jump(int[] nums) {
        int maxReach = 0;
        int steps = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == end) {
                steps++;
                end = maxReach;
            }
        }
        return steps;
    }
}
