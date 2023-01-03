import Foundation 

class ValidateSubsequence {
    static func isValidSubsequence1(_ array: [Int], _ sequence: [Int]) -> Bool {
        var count = 0
        var index = 0
        while(index < array.count) {
            if(sequence.count == count) { break }
            if(array[index] == sequence[count]) { count += 1 }
            index += 1
        }
        return sequence.count == count
    }

    static func isValidSubsequence2(_ array: [Int], _ sequence: [Int]) -> Bool { 
        var count = sequence.count - 1
        var index = array.count - 1
        while(index >= 0) {
            if(count == -1) { break }
            if(array[index] == sequence[count]) { count -= 1 }
            index -= 1
        }
        return count == -1
    }

    static func isValidSubsequence3(_ array: [Int], _ sequence: [Int]) -> Bool { 
        var list = sequence
        for index in stride(from: 0, to: array.count, by: 1) {
            if(list.isEmpty) { break }
            if(array[index] == list.first!) { list.remove(at: 0) }
        }
        return list.isEmpty
    }

    static func isValidSubsequence4(_ array: [Int], _ sequence: [Int]) -> Bool { 
        var list = sequence
        for index in stride(from: 0, to: array.count, by: 1) {
            if(list.isEmpty) { break }
            if(array[index] == list.first!) { list.removeFirst() }
        }
        return list.isEmpty
    }

    static func isValidSubsequence5(_ array: [Int], _ sequence: [Int]) -> Bool { 
        var list = sequence
        for index in stride(from: array.count - 1, to: -1, by: -1) {
            if(list.isEmpty) { break }
            if(array[index] == list.last!) { list.removeLast() }
        }
        return list.isEmpty
    }
}