var pangram = function(sentence) {
    let set = new Set();
    for(const character of sentence) {
        if(!set.has(character) && character.match(/[a-zA-Z]/)) {
            set.add(character);
        }
    }
    return set.size === 26;
}
exports.pangram = pangram;