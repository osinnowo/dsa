class LongestSubstringWithoutRepeatingCharacter {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var maxLength = 0
        var leftIndex = 0
        var rightIndex = 0
        var charSet = Set<Character>()
        
        let chars = Array(s)
        let length = chars.count
        
        while rightIndex < length {
            let currentChar = chars[rightIndex]
            if charSet.contains(currentChar) {
                charSet.remove(chars[leftIndex])
                leftIndex += 1
            } else {
                charSet.insert(currentChar)
                maxLength = max(maxLength, charSet.count)
                rightIndex += 1
            }
        }
        
        return maxLength
    }
}