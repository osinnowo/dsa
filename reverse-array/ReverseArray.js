function reverseArray1(array) {
    let result = [];
    for(let index = array.length - 1; index >= 0; index--) {
        result.push(array[index]);
    }
    return result;
}

function reverseArray2(array) {
    for(let index = 0; index < array.length / 2; index++) {
        const lastIndex = array.length - index - 1;
        const temp = array[lastIndex];
        array[lastIndex] = array[index];
        array[index] = temp;
    }
    return array;
}

function reverseArray3(array) {
    let left = 0;
    let right = array.length - 1;
    while(left < right) {
        let temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++; right--;
    }
    return array;
}

