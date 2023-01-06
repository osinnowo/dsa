function nonDuplicate1(array) {
    const result = [];
    array.sort((a, b) => a - b);
    for(let i = 0; i < array.length; i++) {
        let distinctIndex = i;
        for(let j = i + 1; j < array.length; j++) {
            if(array[distinctIndex] === array[j]) {
                distinctIndex = j;
            }
        }
        result.push(array[distinctIndex]);
        i = distinctIndex;
    }
    return result;
}

function nonDuplicate2(array) {
    var set = new Set();
    let index = 0;
    while(index < array.length) {
        set.add(array[index]);
        index++;
    }
    return [...set]; //Array.from(set)
}

exports.nonDuplicate = nonDuplicate1