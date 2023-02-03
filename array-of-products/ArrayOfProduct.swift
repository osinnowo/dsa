import Foundation

class ArrayOfProduct {
    func arrayOfProduct(_ array: [Int]) -> [Int] {
        var result: [Int] = []
        for i in stride(from: 0, to: array.count, by: 1) {
            var temp = 1
            for j in stride(from: 0, to: array.count, by: 1) {
                if (i == j) { continue }
                temp *= array[j]
            }
            result.append(temp)
        }
        return result
    }

    func arrayOfProduct(_ array: [Int]) -> [Int] {
        var result: [Int] = []
        for (i, k) in array.enumerated() {
            var temp = 1
            for (j, m) in array.enumerated() {
                if(i == j) { continue }
                temp *= m
            }
            result.append(temp)
        }
        return result
    }
}