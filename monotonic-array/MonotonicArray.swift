import Foundation

class MonotonicArray {
    func isMonotonic(array: [Int]) -> Bool {
        if(array.isEmpty) { return true }
            var isIncreasing = array[0] < array[array.count - 1] 
            for index in 0 ..< array.count - 1 {
            if(isIncreasing && (array[index] > array[index + 1])) { return false }
            if(!isIncreasing && (array[index] < array[index + 1])) { return false }
        }
        return true
    }
}