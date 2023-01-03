import Foundation

class SortBracket {
    func sortBracket1(_ str: inout String) -> String {
        var array: [Character] = Array(str)
        var result: [Character] = []
        for item in array {
            if(item == ")") {
                result.append(item)
                continue
            }
            result.insert(item, at: 0)
        }
        return String(result)
    }

    func sortBracket2(_ str: inout String) -> String {
        var array: [Character] = Array(str)
        var left = 0
        var right = str.count - 1
        while(left < right) {
            if(array[left] == "(") { left += 1; continue }
            while(left < right) {
                if(array[right] == "(") {
                    array.swapAt(left, right)
                    left += 1
                    right -= 1
                    break
                }
                right -= 1
            }
        }
        return String(array)
    }

    func sortBracket3(_ str: inout String) -> String {
        var array = Array(str)
        var left = 0
        var right = array.count - 1
        while(left < right) {
            while(left < right && array[left] == "(") { left += 1 }
            while(left < right && array[right] == ")") { right -= 1 }
            array.swapAt(left, right)
            left += 1; right -= 1;
        }
        return String(array)
    }
}