var rotateArray1 = (array, times) => {
    let result = [];
    let count = 0;
    
    for(let i = times; i < array.length; i++) {
        result[count] = array[i];
        count++;
    }

    for(let i = 0; i < times; i++) {
        result[count] = array[i];
        count++;
    }
    return result;
}

var rotateArray2 = (array, times) => {
    for(let i = 0; i < times; i++) {
        let firstItem = array[0];
        for(let j = 0; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = firstItem;
    }
    return array;
}

var rotateArray3 = (array, times) => {
    let i = 0;
    while(i < times) {
        let firstItem = array[0];
        for(let j = 0; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = firstItem;
        i++;
    }
    return array;
}

exports.rotateArray = rotateArray1;