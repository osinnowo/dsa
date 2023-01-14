function firstDuplicateNumber(array) {
    let map = new Map();
    for(let i = 0; i < array.length; i++) {
        const current = map.get(array[i]) ?? 0;
        if(current == 1) { return array[i]; }
        map.set(array[i], (map.get(array[i]) ?? 0) + 1);
    }
    return -1;
}

function firstDuplicateNumber(array) {
    let set = new Set();
    for(const arr of array) {
        if(set.has(arr)) { return arr; }
        set.add(arr);
    }
    return -1;
}

exports.firstDuplicateNumber = firstDuplicateNumber;