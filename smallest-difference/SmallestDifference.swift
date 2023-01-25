import Foundation

class SmallestDifference {
    func smallestDifference(arrayOne: [Int], arrayTwo: [Int]) -> [Int] {
        arrayOne.sort(); arrayTwo.sort()
        var result = []
        var idxOne = 0
        var idxTwo = 0
        var smallest = Int.max
        var current = Int.max
        while(idxOne < arrayOne.count && idxTwo < arrayTwo.count) {
            var first = arrayOne[idxOne]
            var second = arrayTwo[idxTwo]
            if(first < second) {
                current = second - first
                idxOne += 1
            } else if (first > second) {
                current = first - second
                idxTwo += 1
            } else {
                return [ first, second ]
            }
            if(current < smallest) {
                smallest = current
                result = [ first, second ]
            }
        }
        return result
    }
}