import Foundation

class ThreeNumberSum {
    func threeNumbersSum(array: inout [Int], targetSum: Int) -> [[Int]] {
        array.sort()
        var results: [[Int]] = []
        for index in stride(from: 0, to: array.count, by: 1) {
            var left = index + 1
            var right = array.count - 1
            while(left < right) {
                var sum = array[index] + array[left] + array[right]
                if(sum == targetSum) {
                    results.append([ array[index], array[left], array[right] ])
                    left += 1; right -= 1;
                } else if (sum < targetSum) {
                    left += 1
                } else {
                    right -= 1
                }
            }
        }
        return results
    }
}