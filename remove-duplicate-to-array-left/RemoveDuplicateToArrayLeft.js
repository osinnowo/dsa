function removeDuplicateToArray(nums) {
    let count = 1;
    for (let i = 0; i < nums.length - 1; i++) {
        if(nums[i] < nums[i + 1]) {
            nums[count] = nums[i + 1];
            count++;
        }
    }
    return count;
}   

exports.removeDuplicateToArray = removeDuplicateToArray;