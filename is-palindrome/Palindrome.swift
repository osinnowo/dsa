import Foundation 

class Palindrome {
    func isPalindrome(str: String) -> Bool {
        var array: [Character] = Array(str)
        var left = 0
        var right = str.count - 1
        while(left < right) {
            if(array[left].lowercased() != array[right].lowercased()) { return false }
            left += 1; right -= 1;
        }
        return true
    }

    func isPalindrome2(str: String) -> Bool {
        var array: [Character] = Array(str)
        var left = 0
        var right = str.count - 1
        while(left < right) {
            while left < right , !isLetterOrDigit(array[left]) { left += 1 }
            while left < right , !isLetterOrDigit(array[right]) { right -= 1 }
            if(array[left].lowercased() != array[right].lowercased()) { return false }
            left += 1; right -= 1;
        }
        return true
    }

    func isLetterOrDigit(_ character: Character) -> Bool {
        return character.isLetter || character.isNumber
    }
}