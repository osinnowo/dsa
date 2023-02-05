import Foundation

class LongestPeak {
    func longestPeak(_ array: [Int]) -> Int {
        var longestPeakLength: Int = 0
        var index = 1
        while index < array.count - 1 {
            var isOverlap = array[index - 1] < array[index] && array[index] > array[index + 1]
            if(!isOverlap) {
                index += 1; continue
            }

            var leftIndex = index - 2;
            while leftIndex >= 0, array[leftIndex] < array[leftIndex + 1] {
                leftIndex -= 1
            }

            var rightIndex = index + 2
            while rightIndex < array.count, array[rightIndex] < array[rightIndex - 1] {
                rightIndex += 1
            }

            longestPeakLength = max(longestPeakLength, rightIndex - leftIndex - 1)
            index = rightIndex
        }
        return longestPeakLength  
    }
}