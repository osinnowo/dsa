/* 
   Description:
   Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the 
   array such that nums[i] == nums[j] and abs(i - j) <= k.
   
   Example I:
   Input: nums = [1,2,3,1], k = 3
   Output: true

   Example II:
   Input: nums = [1,0,1,1], k = 1
   Output: true

   Example III:
   Input: nums = [1,2,3,1,2,3], k = 2
   Output: false

   Constraints:

    *   1 <= nums.length <= 105
    *   -109 <= nums[i] <= 109
    *   0 <= k <= 105
**/ 

var containsDuplicateTwo = function(nums, k) {
    let set = new Set();
    for(let i = 0; i < nums.length; i++) {
        if(set.contains(nums[i])) { return true; }
        set.add(nums[i]);
        if(nums.length > k) {
            set.delete(nums[i - k]);
        }
    }
    return false;
};

exports.containsDuplicateTwo = containsDuplicateTwo;