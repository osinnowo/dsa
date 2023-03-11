var lengthOfLastWord = function(word) {
    let end = word.length - 1;
    while(end >= 0 && word[end] === ' ') {
        end -= 1;
    }   

    let right = end;
    while(right >= 0 && word[right] !== ' ') {
        end -= 1;
    }
    return end - right;
}

exports.lengthOfLastWord = lengthOfLastWord;