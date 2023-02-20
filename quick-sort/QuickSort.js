var quickSort = (array) => {
    quickSortElement(array, 0, array.length - 1);
    return array;
}

var quickSortElement = (array, start, end) => {
    if(start >= end) { return ; }
    let left = start;
    let right = end;
    let pivot = array[Math.floor((start + end) / 2)];
    while (left <= right) {
        while(array[left] < pivot) { left++; }
        while(array[right] > pivot) { right--; }
        if(left <= right) {
            [array[left], array[right]] = [array[right], array[left]];
            left++; right--;
        }
    }
    quickSortElement(array, start, right);
    quickSortElement(array, left, end);
}

exports.quickSortElement = quickSortElement;
exports.quickSort = quickSort;