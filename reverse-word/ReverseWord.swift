import Foundation

class ReverseWord {
    func reverseWord(_ word: String) -> String {
        var words: [String] = word.components(separatedBy: .whitespaces)
        for index in 0 ..< (words.count / 2) {
            let lastItemIndex = words.count - index - 1
            var temp = words[index]
            words[index] = words[lastItemIndex]
            words[lastItemIndex] = temp
        }
        return words.joined(separator: " ")
    }
}