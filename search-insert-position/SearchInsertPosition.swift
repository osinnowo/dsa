class SearchInsertPosition {
    func searchInsert(_ nums: [Int], _ target: Int) -> Int {
        var left = 0
        var right = nums.count - 1
        while left <= right {
            if nums[left] == target {
                return left
            } else if nums[left] < target {
                left += 1
            } else {
                right -= 1
            } 
        }
        return left
    }
}