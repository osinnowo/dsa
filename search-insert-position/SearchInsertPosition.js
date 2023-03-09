var searchPosition1 = (nums, target) =>  {
    var left = 0;
    var right = nums.length - 1;
    while(left <= right) {
        if(nums[left] == target) {
            return left;
        } else if (nums[left] < target) {
            left += 1;
        } else {
            right -= 1;
        }
    }
    return left;
}

exports.searchPosition1 = searchPosition1;