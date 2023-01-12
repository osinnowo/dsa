function firstNonRepeatingCharacter(string) {
    for(let i = 0; i < string.length; i++) {
        let isDuplicate = false;
        for (let j = 0; j < string.length; j++) {
            if((i !== j) && string[i] === string[j]) {
                isDuplicate = true;
            }
        }
        if(!isDuplicate) return i;
    }
    return -1;
}

function firstNonRepeatingCharacter2(string) {
    let map = new Map();
    for(const str of string) {
        map.set(str, map.get(str) === undefined ? 0 : map.get(str) + 1);
    }
    for(let i = 0; i < string.length; i++) {
        if(map.get(string[i]) === 0) { return i ; }
    }
    return -1;
}

exports.firstNonRepeatingCharacter = firstNonRepeatingCharacter;