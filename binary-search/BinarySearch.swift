import Foundation

class BinarySearch {
    func binarySearchOne(_ array: [Int], _ target: Int) -> Int {
        var left = 0
        var right = array.count - 1;
        return binarySearchIterative(array, target, &left, &right)
    }
    
    func binarySearchIterative(_ array: [Int], _ target: Int, _ left: inout Int, _ right: inout Int) -> Int {
        while left <= right {
            var middle = (left + right) / 2;
            var potentialMatch = array[middle]
            if(target == potentialMatch) {
                return middle
            } else if (target < potentialMatch) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return -1
    }

    func binarySearchTwo(_ array: [Int], _ target: Int) -> Int {
        var left = 0
        var right = array.count - 1;
        return binarySearchRecursive(array, target, &left, &right)
    }

    func binarySearchRecursive(_ array: [Int], _ target: Int, _ left: inout Int, _ right: inout Int) -> Int {
        if left > right { return -1 }
        let middle = (left + right) / 2;
        let potentialMatch = array[middle]
        if(target == potentialMatch) {
            return middle
        } else if target < potentialMatch {
            right = middle - 1
            return binarySearchRecursive(array, target, &left, &right)
        } else {
            left = middle + 1
            return binarySearchRecursive(array, target, &left, &right)
        }
    }
}