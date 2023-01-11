import Foundation

class FourSum {
    public func fourSum(array: inout [Int], targetSum: Int) -> [[Int]] {
        array.sort{ $0 < $1}
        var results: [[Int]] = []
        for i in stride(from: 0, to: array.count, by: 1) {
            for j in stride(from: i + 1, to: array.count, by: 1) {
                var left = j + 1
                var right = array.count - 1
                while(left < right) {
                    var sum = array[i] + array[j] + array[left] + array[right]
                    if(sum == targetSum) {
                        results.append([ array[i], array[j], array[left], array[right]])
                        left += 1; right -= 1;
                    } else if (sum < targetSum) {
                        left += 1
                    } else if (sum > targetSum) {
                        right -= 1
                    }
                }
            }
        }
        return results
    }
}