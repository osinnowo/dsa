import Foundation

class MinimumDifference {
    public func minimumDifference(array: inout [Int]) -> [[Int]] {
        array.sort()
        var difference = array[1] - array[0]
        var results: [[Int]] = []
        for i in stride(from: 2, to: array.count, by: 1) {
            difference = min(difference, array[i] - array[i - 1])
        }
        for j in stride(from: 1, to: array.count, by: 1) {
            if(difference == array[j] - array[j - 1]) {
                results.append([array[j], array[j - 1]])
            }
        }
        return results;
    }
}