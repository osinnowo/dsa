function longestPalindromeString(str) {
    if(str.length === 1) return str;
    let longestPalindrome = ""
    for(let i = 0; i < str.length; i++) {
        for(let j = i + 1; j < str.length; j++) {
            let substring = str.substring(i, j + 1);
            if(substring.length > longestPalindrome.length && isPalindrome(substring)) {
                longestPalindrome = substring;
            }
        }
    }
    return longestPalindrome;
}

function isPalindrome(str) {
    let left = 0;
    let right = str.length - 1;
    while(left < right) {
        if(str[left].toLowerCase() !== str[right].toLowerCase()) return false;
        left++; right--;
    }
    return true;
}

exports.longestPalindromeString = longestPalindromeString;