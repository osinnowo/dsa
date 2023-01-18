function insertionSort1(array) {
    for(let i = 1; i < array.length; i++) {
        let j = i;
        while(j > 0 && array[j] < array[j - 1]) {
            [array[j], array[j - 1]] = [array[j - 1], array[j]];
            j--;
        }
    }
    return array;
}

function insertionSort2(array) {
    for(let i = array.length - 2; i >= 0; i--) {
        let j = i;
        while(j <= array.length - 2 && array[j] > array[j + 1]) {
            [array[j], array[j + 1]] = [array[j + 1], array[j]];
            j++;
        }
    }
    return array;
}

exports.insertionSort = this.insertionSort1;