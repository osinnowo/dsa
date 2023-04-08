var longestPalindrome = function(s) {
    let map = new Map();
    let maxLength = 0;
    let oddLength = 0;
    for(const character of s) {
        map.set(character, (map.get(character) || 0 ) + 1); 
    }
    for(const item of map.values()) {
        if(item % 2 === 0) {
            maxLength += item;
        } else {
            maxLength += item - 1;
            oddLength = 1;
        }
    }
    return maxLength + oddLength;
};

exports.longestPalindrome = longestPalindrome;