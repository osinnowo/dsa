function monotonicArray(array) {
    if(array.length == 0) { return true; }
    let isIncreasing = array[0] < array[array.length - 1];
    for(let index = 0; index < array.length; index++) {
        if(isIncreasing && (array[index] > array[index + 1])) { return false; }
        if(!isIncreasing && (array[index] < array[index + 1])) { return false; }
    }
    return true;
}

exports.monotonicArray = monotonicArray;