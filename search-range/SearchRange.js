var searchRange = function(nums, target) {
    let left = binarySearch(nums, target, true);
    if(left === -1) { return [-1, -1] }
    let right = binarySearch(nums, target, false);
    return [left, right];
}

var binarySearch = function(nums, target, searchLeft) {
    let result = -1;
    let left = 0;
    let right = nums.length - 1;
    
    while(left <= right) {
        let mid = Math.floor((left + right) / 2);
        if(target === nums[mid]) {
            result = mid;
            if(searchLeft) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else if (target < nums[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return result;
}
