import Foundation

public class LongestPalindromeString {
    func longestPalindromicSubstring(string: String) -> String {
        if(string.count == 1) { return string }
            var longestPalindrome = ""
            for i in 0 ..< string.count {
                for j in i ..< string.count {
                    let leftIndex = string.index(string.startIndex, offsetBy: i)
                    let rightIndex = string.index(string.startIndex, offsetBy: j)
                    let substring = String(string[leftIndex ... rightIndex])
                    if substring.count > longestPalindrome.count, isPalindrome(substring) {
                        longestPalindrome = substring
                    }
                }
            }
            return longestPalindrome
    }

    func isPalindrome(_ str: String) -> Bool {
            let characters: [Character] = Array(str)
            for i in stride(from: 0, to: characters.count / 2, by: 1) {
                if(characters[i].lowercased() != characters[characters.count - i - 1].lowercased()) {
                    return false
                }
            }
            return true
    }
}