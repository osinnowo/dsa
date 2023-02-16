var midArrayElement = (array) => {
    let slow = 0;
    let fast = 0;
    while(slow < array.length && ++fast < array.length) {
        slow++; fast++;
    }
    return array[slow];
}

exports.findMidArray = findMidArray;