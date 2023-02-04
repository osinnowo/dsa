var findTheKthLargestNumber = (array, k) => {
    array.sort((a, b) => a - b);
    return array[array.length - k];
}

exports.findTheKthLargestNumber = findTheKthLargestNumber;