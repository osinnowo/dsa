function palindrome1(str) {
    let left = 0;
    let right = str.length - 1;
    while(left < right) {
        if(str.charAt(left).toLowerCase() !== str.charAt(right).toLowerCase()){
            return false;
        }
    }
    return true;
}

function palindrome(str) {
    let left = 0;
    let right = str.length - 1;
    while(left < right) {
        while(left < right && !isLetterOrDigit(str.charAt(left))) { left++; }
        while(left < right && !isLetterOrDigit(str.charAt(right))) { right--; }
        if(str.charAt(left).toLowerCase() !== str.charAt(right).toLowerCase()) return false;
        left++; right--;
    }
    return true;
}

var isLetterOrDigit = (character) => {
    if(typeof character !== "string") return false;
    return character.toLowerCase() !== character.toUpperCase();
}

exports.palindrome = palindrome;