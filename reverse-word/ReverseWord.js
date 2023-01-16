function reverseWord(str) {
    let words = str.split(" ");
    for(let i = 0; i < words.length / 2; i++) {
        let lastIndex = words.length - i - 1;
        let temp = words[i];
        words[i] = words[lastIndex];
        words[lastIndex] = temp;
    }
    return words.join(" ");
}

exports.reverseWord = reverseWord;