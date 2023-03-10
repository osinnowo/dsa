function moveElementToRight1(array, elementToMove) {
    let left = 0;
    let right = array.length - 1;
    while(left < right){
        if(array[left] != elementToMove) { left++; continue; }
        while(left < right) {
            if(array[right] != elementToMove) {
                [array[left], array[right]] = [array[right], array[left]];
                left++; right--; break;
            }
            right--;
        }
    }
    return array;
}

function moveElementToRight1(array, elementToMove) { 
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

function moveElementToRight1(array, elementToMove) { 
    const result = [];
    for(const item of array) {
        if(item === elementToMove) {
            result.push(item);
            continue;
        }
        result.unshift(item);
    }
    return result;
}

exports.moveElementToRight = moveElementToRight1;