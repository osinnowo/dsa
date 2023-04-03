var runningSum = function(nums) {
    let result = []; result.push(nums[0]);
    for(let i = 1; i < nums.length; i++) {
        result[i] = result[result.length - 1] + nums[i];
    }
    return result;
};

exports.runningSum = runningSum;