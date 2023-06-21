/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let result = "";
    let i = 0, j = 0

    while(i < word1.length && j < word2.length) {
        if(i === j) {
            result += word1.charAt(i);
            i += 1;
        } else {
            result += word2.charAt(j);
            j += 1;
        }
    }

    while(i < word1.length) {
        result = result.concat(word1.charAt(i));
        i += 1
    }

    while(j < word2.length) {
        result = result.concat(word2.charAt(j));
        j += 1
    }

    return result;
};