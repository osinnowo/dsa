var binarySearchOne = function(array, target) {
    return binarySearchIterative(array, target, 0, array.length - 1);
}   

var binarySearchIterative = function(array, target, left, right) {
    while(left <= right) {
        let middle = Math.floor((left + right) / 2);
        let potentialMatch = nums[middle];
        if(target === potentialMatch) {
            return middle;
        } else if (target < potentialMatch) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
    }
    return -1;
}

var binarySearchTwo = function(array, target) {
    return binarySearchRecursive(array, target, 0, array.length - 1);
}

var binarySearchRecursive = function(array, target, left, right) {
    if(left > right) { return -1; }
    let middle = Math.floor((left + right) / 2);
    const potentialMatch = array[middle];
    if(target === potentialMatch) {
        return middle;
    } else if (target < potentialMatch) {
        return binarySearchRecursive(array, target, left, middle - 1);
    } else {
        return binarySearchRecursive(array, target, middle + 1, right);
    }
}