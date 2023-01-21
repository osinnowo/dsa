import Foundation 
class RemoveDupliateToArrayLeft {
    func removeDuplicateToArrayLeft(_ nums: inout [Int]) -> Int {
        var count = 1;
        for index in stride(from: 0, to: nums.count, by: 1) {
            if(nums[index] < nums[index + 1]) {
                nums[count] = nums[index + 1]
                count += 1
            } 
        }
        return nums
    }
}