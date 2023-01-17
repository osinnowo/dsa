function bubbleSort1(array) {
    let isSorted = false;
    while(!isSorted) {
        isSorted = true;
        let index = 1;
        while(index < array.length) {
            if(array[index - 1] > array[index]) {
                isSorted = false;
                [array[index - 1], array[index]] = [array[index], array[index - 1]];
            }
            index++;
        }
    }
    return array;
}

function bubbleSort2(array) {
    let isSorted = false;
    while(!isSorted) {
        isSorted = true;
        let index = 0;
        while(index < array.length - 1) {
            if(array[index] > array[index + 1]) {
                isSorted = false;
                [array[index + 1], array[index]] = [array[index], array[index + 1]];
            }
            index++;
        }
    }
    return array;
}

function bubbleSort3(array) {
    let isSorted = false;
    while(!isSorted) {
        isSorted = true;
        let index = array.length - 1;
        while(index > 0) {
            if(array[index] < array[index - 1]) {
                isSorted = false;
                [array[index], array[index - 1]] = [array[index - 1], array[index]]
            }
            index--;
        }
    }
    return array;
}

exports.bubbleSort = bubbleSort1;