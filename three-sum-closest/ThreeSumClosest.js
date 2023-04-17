var threeSumClosest = function(nums, target) {
    //     0.   1.   2    3
    // [  -1,  2,   1,  -4]
    var closestSum = Infinity;
    for(let i = 0; i < nums.length - 2; i++) {
        for(let j = i + 1; j < nums.length - 1; j++) {
            for(let k = j + 1; k < nums.length; k++) {
                const sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
            }
        }
    }
    return closestSum;
};
