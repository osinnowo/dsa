class Solution {
    func nextPermutation(_ nums: inout [Int]) {
        // Find the first element that violates the descending order
        var i = nums.count - 2
        while i >= 0 && nums[i] >= nums[i + 1] {
            i -= 1
        }
        
        if i >= 0 {
            // Find the smallest element to the right of i that is greater than nums[i]
            var j = nums.count - 1
            while j >= 0 && nums[j] <= nums[i] {
                j -= 1
            }
            
            // Swap nums[i] and nums[j]
            nums.swapAt(i, j)
        }
        
        // Reverse the order of the elements to the right of i
        var left = i + 1
        var right = nums.count - 1
        while left < right {
            nums.swapAt(left, right)
            left += 1
            right -= 1
        }
    }
}
