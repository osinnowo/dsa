class MergeAlternately {
    func mergeAlternately(_ word1: String, _ word2: String) -> String {
        var result = ""
        var i = 0, j = 0

        while i < word1.count, j < word2.count {
            if i == j {
                result.append(word1[word1.index(word1.startIndex, offsetBy: i)])
                i += 1
            } else {
                result.append(word2[word2.index(word2.startIndex, offsetBy: j)])
                j += 1
            }
        }

        while i < word1.count {
            result.append(word1[word1.index(word1.startIndex, offsetBy: i)])
            i += 1
        }

        while j < word2.count {
            result.append(word2[word2.index(word2.startIndex, offsetBy: j)])
            j += 1
        }

        return result
    }
}