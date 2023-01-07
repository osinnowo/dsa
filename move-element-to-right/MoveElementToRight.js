function moveElementToRight(array, elementToMove) {
    let left = 0;
    let right = array.length - 1;
    while(left < right) {
        if(array[left] != elementToMove) { left++; continue; }
        while(left < right) {
            if(array[right] != elementToMove) {
                [array[right], array[left]] =  [array[left], array[right]];
                left++; right--;
                break;
            }
            right--;
        }
    }
    return array;
}

function moveElementToRight(array, elementToMove) {
    let left = 0;
    let right = array.length - 1;
    while(left < right) {
        while(left < right && array[left] != elementToMove) { left++; }
        while(left < right && array[right] == elementToMove) { right--; }
        [array[left], array[right]] = [array[right], array[left]];
        left++; right--;
    }
    return array;
}

exports.moveElementToRight = moveElementToRight;