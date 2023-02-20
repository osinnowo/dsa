import Foundation {
    class MaxSubArray {
        func maxSubArray(_ nums: [Int]) -> Int {
            var maxSoFar = nums[0]
            var maxEndingHere = nums[0]
            for index in stride(from: 1, to: nums.count, by: 1) {
                maxEndingHere = max(maxEndingHere + nums[index], nums[index])
                maxSoFar = max(maxSoFar, maxEndingHere)
            }
            return maxSoFar
        }
    }
}