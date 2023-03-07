var balancedBracket = (string) => {
    let map = new Map([[")", "("], ["]", "["], ["}", "{"]]);
    let stack = [];
    for(const character of string) {
        if (character == "(" || character == "[" || character == "{") {
            stack.push(character);
            continue;
        }

        if(map.get(character) === undefined) { continue; }
        if(stack.length !== 0 && stack[stack.length - 1] == map.get(character)) {
            stack.pop();
            continue;
        }
        return false;
    }
    return stack.length == 0;
}

exports.balancedBracket = balancedBracket;