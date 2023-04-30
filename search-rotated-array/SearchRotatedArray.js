/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchRotatedArray = function(nums, target) {
    let isAscending = true;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i - 1] > nums[i]) {
            isAscending = false;
            break;
        }
    }
    
    let mainIndex = 0;
    if (!isAscending) {
        let left = 0;
        let right = nums.length - 1;
        while (left <= right) {
            let middle = Math.floor((left + right) / 2);
            if (nums[middle] === target) {
                mainIndex = middle;
                break;
            }
            if (nums[middle] >= nums[left]) {
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        if (left > right) {
            return -1;
        }
    } else {
        let left = 0;
        let right = nums.length - 1;
        while (left <= right) {
            let middle = Math.floor((left + right) / 2);
            if (nums[middle] === target) {
                mainIndex = middle;
                break;
            }
            if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (left > right) {
            return -1;
        }
    }

    return mainIndex;
};
