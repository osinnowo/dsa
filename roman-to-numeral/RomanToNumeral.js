const map = new Map([
    ["I", 1],
    ["V", 5],
    ["X", 10],
    ["L", 50],
    ["C", 100],
    ["D", 500],
    ["M", 1000],
]);

// s => "LVIII"
// s => "MCMXCIV"
var romanToNumeral = function(s) {
    let index = 0;
    let result = 0;
    while(index < s.length) {
        let charOne = s.charAt(index);
        let firstNum = map.get(charOne);

        let nextCharIndex = index + 1;

        let secondNum = 0;
        if(nextCharIndex < s.length) {
            let charTwo = s.charAt(nextCharIndex);
            secondNum = map.get(charTwo);
        }

        if(firstNum >= secondNum) {
            result += firstNum
            index += 1
        } else if (firstNum < secondNum){
            result += (secondNum - firstNum);
            index += 2;
        }
    }
    return result;
};

exports.romanToNumeral = romanToNumeral;