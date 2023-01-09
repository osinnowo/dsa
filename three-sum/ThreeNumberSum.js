function threeNumberSum(array, targetSum) {
    array.sort((a, b) => a - b);
    const results = [];
    for(let index = 0; index < array.length; index++) {
        let left = index + 1;
        let right = array.length - 1;
        while(left < right) {
            let sum = array[index] + array[left] + array[right];
            if(sum === targetSum) {
                results.push([ array[index], array[left], array[right] ]);
                left++; right--;
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
    }
    return results;
}

exports.threeNumberSum = threeNumberSum;