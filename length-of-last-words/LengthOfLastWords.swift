class LengthOfLastWords {
    func lengthOfLastWords(_ word: String) -> Int {
        var end = word.count - 1
        while end >= 0 , word[word.index(word.startIndex, offsetBy: end)] == " " {
            end -= 1
        }
        var left = end;
        
        while left >= 0 , word[word.index(word.startIndex, offsetBy: left)] != " " {
            left -= 1
        }
        return end - left;
    }
}