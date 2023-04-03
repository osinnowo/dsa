import Foundation

class RunningSumArray {
    func runningSum(_ nums: [Int]) -> [Int] {
        var result: [Int] = Array(repeating: 0, count: nums.count)
        result[0] = nums[0]
        for index in 1 ..< nums.count {
            result[index] = result[index - 1] + nums[index]
        }
        return result
    }
}