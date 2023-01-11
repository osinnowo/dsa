function fourSum(array, targetSum) {
    array.sort();
    const results = [];
    for(let i = 0; i < array.length; i++) {
        for(let j = i + 1; j < array.length; j++) {
            let left = j + 1;
            let right = array.length - 1;
            while(left < right) {
                let sum = array[i] + array[j] + array[left] + array[right];
                if(sum === targetSum) {
                    results.push([ array[i], array[j], array[left], array[right]]);
                    left++; right--;
                } else if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                }
            }
        }
    }
    return results;
}

exports.fourSum = fourSum;