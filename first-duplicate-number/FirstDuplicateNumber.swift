import Foundation

class FirstDuplicateNumber {
    func firstDuplicateNumber1(_ numbers: [Int]) -> Int {
        var set: Set<Int> = []
        var index = 0
        while(index < numbers.count) {
            if(set.contains(numbers[index])) { return numbers[index] }
            set.insert(numbers[index])
            index += 1
        }
        return -1
    }

    func firstDuplicateNumber2(_ numbers: [Int]) -> Int {
        var dictionary: [Int: Int] = [:]
        for index in stride(from: 0, to: numbers.count, by: 1) {
            if let current = dictionary[numbers[index]] {
                return numbers[index]
            }
            dictionary[numbers[index]] = 0
        }
        return -1
    }
}