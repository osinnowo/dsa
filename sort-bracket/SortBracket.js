function sortBracket1(str) {
    let result = []
    for(const character of str) {
        if(character === '(') {
            result.unshift(character);
            continue;
        }
        result.push(')');
    }
    return result.join("");
}

function sortBracket2(str) {
    let characters = [...str]
    let left = 0;
    let right = characters.length - 1;
    while(left < right) {
        while(left < right && characters[left] === "(") { left++; }
        while(left < right && characters[right] === ")") { right++; }
        [characters[left], characters[right]] = [characters[right], characters[left]];
        left++; right--;
    }   
    return characters.join("");
}

exports.sortBracket = sortBracket1;